package training.com.cleancodeworkshop.utils;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@Singleton
public class ErrorMessageFactory {
    @Inject
    public ErrorMessageFactory(){

    }

    public String createDefaultError(){
        return "Default Error";
    }
}
