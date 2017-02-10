package training.com.cleancodeworkshop.calculator.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import training.com.cleancodeworkshop.calculator.CalculatorContract;
import training.com.cleancodeworkshop.calculator.CalculatorPresenter;
import training.com.cleancodeworkshop.calculator.TestCalculatorPresenter;

/**
 * Created by Semicolon07 on 2/10/2017 AD.
 */

@Module
public class CalculatorModule {

    @Provides
    @Named("TestCalculatorPresenter")
    public CalculatorContract.Presenter provideTestCalculatorPresenter(TestCalculatorPresenter presenter) {
        return presenter;
    }

    @Provides
    @Named("CalculatorPresenter")
    public CalculatorContract.Presenter provideCalculatorPresenter(CalculatorPresenter presenter) {
        return presenter;
    }

}
