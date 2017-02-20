package training.com.cleancodeworkshop;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import training.com.cleancodeworkshop.domain.executor.PostExecutionThread;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */
public class UIThread implements PostExecutionThread {

    public UIThread(){

    }
    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
