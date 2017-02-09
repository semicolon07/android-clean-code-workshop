package training.com.cleancodeworkshop.calculator;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public class CalculatorPresenter implements CalculatorContract.Presenter {
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

        view.showResult(String.valueOf(sum));
    }
}
