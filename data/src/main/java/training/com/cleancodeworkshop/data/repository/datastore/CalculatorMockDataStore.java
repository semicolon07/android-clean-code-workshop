package training.com.cleancodeworkshop.data.repository.datastore;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by Semicolon07 on 2/20/2017 AD.
 */

public class CalculatorMockDataStore implements CalculatorDataStore {
    @Override
    public Observable<Integer> plus(final int num1, final int num2) {
        return Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                int sum = num1 + num2;
                if(sum == 0)
                    e.onError(new Exception("Sum is zero. In Mock data store"));

                e.onNext(sum);
                e.onComplete();
            }
        });
    }

    @Override
    public Observable<Integer> minus(int num1, int num2) {
        return null;
    }

}
