package training.com.cleancodeworkshop.domain.executor;

import io.reactivex.Scheduler;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}
