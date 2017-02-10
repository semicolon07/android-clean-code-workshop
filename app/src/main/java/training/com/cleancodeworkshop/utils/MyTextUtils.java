package training.com.cleancodeworkshop.utils;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Semicolon07 on 2/10/2017 AD.
 */
@Singleton
public class MyTextUtils {
    @Inject
    public MyTextUtils(){

    }

    public String convertText(String text){
        return "Text is : "+text;
    }
}
