package training.com.cleancodeworkshop.calculator;

import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import training.com.cleancodeworkshop.di.ActivityScope;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

/**
 * Created by Semicolon07 on 2/10/2017 AD.
 */

@ActivityScope
public class TestCalculatorPresenter implements CalculatorContract.Presenter {

    @Inject
    ErrorMessageFactory errorMessageFactory;

    private CalculatorContract.View view;

    @Inject
    public TestCalculatorPresenter() {

    }

    @Override
    public void setView(CalculatorContract.View view) {
        this.view = view;
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onPlusButtonClick(String num1, String num2) {
        view.showResult(errorMessageFactory.createSample());
    }

    @Override
    public void onMinusButtonClick(String num1, String num2) {

    }

    @Override
    public void onMultiplyButtonClick(EditText firstNumberEditText, TextView secondNumberEditText) {

    }
}
