package training.com.cleancodeworkshop.calculator;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public class CalculatorPresenter implements CalculatorContract.Presenter {
    private CalculatorContract.View view;

    @Override
    public void onPlusButtonClick(String num1, String num2) {
        int first = Integer.parseInt(num1);
        int second = Integer.parseInt(num2);
        int sum = first + second + 1;
        view.showResult(String.valueOf(sum));
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
}
