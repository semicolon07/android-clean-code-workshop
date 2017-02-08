package training.com.cleancodeworkshop.di;

import javax.inject.Singleton;

import dagger.Component;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ErrorMessageFactory errorMessageFactory();
}
