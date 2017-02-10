package training.com.cleancodeworkshop.calculator.di;

import dagger.Component;
import training.com.cleancodeworkshop.calculator.CalculatorFragment;
import training.com.cleancodeworkshop.di.ActivityScope;
import training.com.cleancodeworkshop.di.AppComponent;

/**
 * Created by Semicolon07 on 2/10/2017 AD.
 */

@ActivityScope
@Component(modules = CalculatorModule.class, dependencies = {AppComponent.class})
public interface CalculatorComponent {
    void inject(CalculatorFragment fragment);
}
