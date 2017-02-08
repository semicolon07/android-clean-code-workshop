package training.com.cleancodeworkshop.calculator.di;

import dagger.Component;
import training.com.cleancodeworkshop.calculator.CalculatorFragment;
import training.com.cleancodeworkshop.di.AppComponent;
import training.com.cleancodeworkshop.di.PerActivity;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {CalculatorModule.class})
public interface CalculatorComponent {
    void inject(CalculatorFragment fragment);
}
