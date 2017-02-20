package training.com.cleancodeworkshop.calculator;

import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import io.reactivex.observers.DisposableObserver;
import training.com.cleancodeworkshop.UIThread;
import training.com.cleancodeworkshop.data.repository.CalculatorDataRepository;
import training.com.cleancodeworkshop.domain.PlusCalculateUseCase;
import training.com.cleancodeworkshop.domain.executor.PostExecutionThread;
import training.com.cleancodeworkshop.domain.repository.CalculatorRepository;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
public class CalculatorPresenter implements CalculatorContract.Presenter {

    @Inject
    public CalculatorPresenter() {

    }

    private CalculatorContract.View view;

    @Override
    public void onPlusButtonClick(final String num1, final String num2) {
        //Init Use Case
        PostExecutionThread uiThread = new UIThread();
        CalculatorRepository repository = new CalculatorDataRepository();
        PlusCalculateUseCase useCase = new PlusCalculateUseCase(uiThread,repository);

        PlusCalculateUseCase.RequestValue requestValue = new PlusCalculateUseCase.RequestValue();
        requestValue.setNum1(Integer.parseInt(num1));
        requestValue.setNum2(Integer.parseInt(num2));
        useCase.execute(requestValue, new PlusCalculateUseCaseObserver());
    }


    @Override
    public void onMinusButtonClick(String num1, String num2) {

    }

    @Override
    public void onMultiplyButtonClick(EditText firstNumberEditText, TextView secondNumberEditText) {

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
        this.view = null;
    }


    class PlusCalculateUseCaseObserver extends DisposableObserver<Integer>{

        @Override
        public void onNext(Integer integer) {
            view.showResult(String.valueOf(integer));
        }

        @Override
        public void onError(Throwable e) {
            view.showError(e.getMessage());
        }

        @Override
        public void onComplete() {

        }
    }
}
