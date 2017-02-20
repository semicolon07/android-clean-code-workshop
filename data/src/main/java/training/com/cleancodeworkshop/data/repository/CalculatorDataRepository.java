package training.com.cleancodeworkshop.data.repository;

import io.reactivex.Observable;
import training.com.cleancodeworkshop.data.repository.datastore.CalculatorDataStore;
import training.com.cleancodeworkshop.data.repository.datastore.CalculatorDataStoreFactory;
import training.com.cleancodeworkshop.domain.repository.CalculatorRepository;

/**
 * Created by Semicolon07 on 2/20/2017 AD.
 */

public class CalculatorDataRepository implements CalculatorRepository {
    @Override
    public Observable<Integer> plus(final int num1, final int num2) {
        CalculatorDataStore mockDataStore = CalculatorDataStoreFactory.createMockDataStore();
        return mockDataStore.plus(num1, num2);
    }

    @Override
    public Observable<Integer> minus(int num1, int num2) {
        CalculatorDataStore webApiDataStore = CalculatorDataStoreFactory.createMockDataStore();
        return webApiDataStore.minus(num1, num2);
    }
}
