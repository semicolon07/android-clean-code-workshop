package training.com.cleancodeworkshop.calculator.di;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import training.com.cleancodeworkshop.calculator.CalculatorContract;
import training.com.cleancodeworkshop.calculator.CalculatorPresenter;
import training.com.cleancodeworkshop.di.PerActivity;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@Module
public class CalculatorModule {
    @Inject
    public CalculatorModule(){

    }

    @Provides
    @PerActivity
    CalculatorContract.Presenter provideCalculatorPresenter(CalculatorPresenter presenter){
        return presenter;
    }
}
