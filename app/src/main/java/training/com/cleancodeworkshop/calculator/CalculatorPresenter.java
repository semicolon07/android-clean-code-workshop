package training.com.cleancodeworkshop.calculator;

import javax.inject.Inject;

import training.com.cleancodeworkshop.di.PerActivity;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@PerActivity
public class CalculatorPresenter implements CalculatorContract.Presenter {
    @Inject
    ErrorMessageFactory errorMessageFactory;

    @Inject
    public CalculatorPresenter(){

    }
    private CalculatorContract.View view;

    @Override
    public void attachView(CalculatorContract.View view) {
        this.view = view;
    }

    @Override
    public void plus(String num1, String num2) {
        int first = Integer.parseInt(num1);
        int second = Integer.parseInt(num2);
        int sum = first + second;

        //view.showResult(String.valueOf(sum));
        view.showResult(errorMessageFactory.createDefaultError());
    }
}
