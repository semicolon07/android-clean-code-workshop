package training.com.cleancodeworkshop.calculator;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public interface CalculatorContract {
    interface View {
        void showResult(String result);
        void showLoadingProgress();
    }
    interface Presenter{
        void attachView(CalculatorContract.View view);
        void plus(String num1,String num2);
    }
}
