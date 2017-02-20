package training.com.cleancodeworkshop.calculator;

import android.widget.EditText;
import android.widget.TextView;

import training.com.cleancodeworkshop.base.BasePresenter;
import training.com.cleancodeworkshop.base.BaseView;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public interface CalculatorContract {
    interface View extends BaseView {
        void showResult(String result);
    }

    interface Presenter extends BasePresenter<CalculatorContract.View> {
        void onPlusButtonClick(String num1, String num2);

        void onMinusButtonClick(String num1, String num2);

        void onMultiplyButtonClick(EditText firstNumberEditText, TextView secondNumberEditText);
    }
}
