package training.com.cleancodeworkshop.base;

import android.content.Context;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */

public interface BaseView {
    void showError(String message);

    Context context();
}
