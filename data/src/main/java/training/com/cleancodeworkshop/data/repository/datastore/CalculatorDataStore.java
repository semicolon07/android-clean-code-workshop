package training.com.cleancodeworkshop.data.repository.datastore;

import io.reactivex.Observable;

/**
 * Created by Semicolon07 on 2/20/2017 AD.
 */

public interface CalculatorDataStore {
    Observable<Integer> plus(int num1, int num2);

    Observable<Integer> minus(int num1, int num2);

}
