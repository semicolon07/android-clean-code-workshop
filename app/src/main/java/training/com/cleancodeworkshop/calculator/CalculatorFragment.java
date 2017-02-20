package training.com.cleancodeworkshop.calculator;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.parceler.Parcels;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import training.com.cleancodeworkshop.R;
import training.com.cleancodeworkshop.StudentModel;
import training.com.cleancodeworkshop.calculator.di.DaggerCalculatorComponent;
import training.com.cleancodeworkshop.di.DaggerAppComponent;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public class CalculatorFragment extends Fragment implements CalculatorContract.View {
    private static final String ARG_STUDENT_MODEL = "ARG_STUDENT_MODEL";
    @BindView(R.id.firstNumber_editText)
    EditText firstNumberEditText;
    @BindView(R.id.secondNumber_editText)
    TextView secondNumberEditText;
    @BindView(R.id.result_textView)
    TextView resultTextView;
    private String firstNumber;
    private String secondNumber;
    private Listener listener;
    private StudentModel model;


    public interface Listener {
        void nextPage();
    }

    @Inject
    @Named("CalculatorPresenter")
    CalculatorContract.Presenter presenter;

    public static CalculatorFragment newInstance(StudentModel model) {
        CalculatorFragment fragment = new CalculatorFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_STUDENT_MODEL, Parcels.wrap(model));

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*model = Parcels.unwrap(getArguments().getParcelable(ARG_STUDENT_MODEL));
        Toast.makeText(getContext(), "Name In fragment : "+model.getName(), Toast.LENGTH_LONG).show();*/

        DaggerCalculatorComponent
                .builder()
                .appComponent(DaggerAppComponent.create())
                .build()
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
        ButterKnife.bind(this, rootView);
        initInstances(rootView, savedInstanceState);

        return rootView;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Listener)
            listener = (Listener) context;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.presenter.setView(this);
    }

    private void initInstances(View rootView, Bundle savedInstanceState) {

    }

    private void prepareInputText() {
        firstNumber = firstNumberEditText.getText().toString();
        secondNumber = secondNumberEditText.getText().toString();
    }


    @Override
    public void showResult(final String result) {
        resultTextView.setText(result);
        //Toast.makeText(getContext(), "Value : " + result, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @OnClick({R.id.plus_button, R.id.minus_button, R.id.multiply_button, R.id.divide_button})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.plus_button:
                prepareInputText();
                presenter.onPlusButtonClick(firstNumber, secondNumber);
                break;
            case R.id.minus_button:
                prepareInputText();
                presenter.onMinusButtonClick(firstNumber, secondNumber);
                break;
            case R.id.multiply_button:
                prepareInputText();
                presenter.onMultiplyButtonClick(firstNumberEditText, secondNumberEditText);
                break;
            case R.id.divide_button:
                break;
        }
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context context() {
        return getContext();
    }
}
