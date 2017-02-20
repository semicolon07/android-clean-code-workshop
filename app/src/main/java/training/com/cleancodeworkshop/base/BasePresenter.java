package training.com.cleancodeworkshop.base;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */

public interface BasePresenter<V> {
    void setView(V view);
    void onPause();
    void onResume();
    void onDestroy();
}
