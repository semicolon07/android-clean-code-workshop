package training.com.cleancodeworkshop.domain.repository;

import io.reactivex.Observable;

/**
 * Created by Semicolon07 on 2/20/2017 AD.
 */

public interface CalculatorRepository {
    Observable<Integer> plus(int num1,int num2);
    Observable<Integer> minus(int num1,int num2);
}
