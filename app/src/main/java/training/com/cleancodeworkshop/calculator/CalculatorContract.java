package training.com.cleancodeworkshop.calculator;

import training.com.cleancodeworkshop.BasePresenter;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public interface CalculatorContract {
    interface View {
        void showResult(String result);
    }
    interface Presenter extends BasePresenter<CalculatorContract.View>{
        void onPlusButtonClick(String num1,String num2);
    }
}
