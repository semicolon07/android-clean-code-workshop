package training.com.cleancodeworkshop.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import training.com.cleancodeworkshop.utils.ErrorMessageFactory;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    ErrorMessageFactory provideErrorMessageFactory(){
        return new ErrorMessageFactory();
    }
}
