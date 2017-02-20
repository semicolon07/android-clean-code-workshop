package training.com.cleancodeworkshop.data.repository.datastore;

/**
 * Created by Semicolon07 on 2/20/2017 AD.
 */

public class CalculatorDataStoreFactory {

    public static CalculatorDataStore createMockDataStore(){
        return new CalculatorMockDataStore();
    }

    public static CalculatorDataStore createWebApiDataStore(){
        return new CalculatorWebApiDataStore();
    }
}
