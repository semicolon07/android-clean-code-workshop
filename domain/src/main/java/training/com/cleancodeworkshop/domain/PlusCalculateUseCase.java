package training.com.cleancodeworkshop.domain;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;
import training.com.cleancodeworkshop.domain.executor.PostExecutionThread;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */

public class PlusCalculateUseCase {

    private PostExecutionThread postExecutionThread;

    public PlusCalculateUseCase(PostExecutionThread postExecutionThread){
        this.postExecutionThread = postExecutionThread;
    }

    public void execute(final RequestValue requestValue, Observer observer){

        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                int sum = requestValue.getNum1() + requestValue.getNum2();
                if(sum == 0)
                    e.onError(new Exception("Sum is zero."));

                e.onNext(sum);
                e.onComplete();
            }
        }).subscribeOn(Schedulers.newThread())
                .observeOn(postExecutionThread.getScheduler())
                .subscribe(observer);

    }

    public static class RequestValue{
        int num1;
        int num2;

        public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return num2;
        }

        public void setNum2(int num2) {
            this.num2 = num2;
        }
    }
}
