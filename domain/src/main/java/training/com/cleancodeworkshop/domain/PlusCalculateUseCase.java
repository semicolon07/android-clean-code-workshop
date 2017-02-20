package training.com.cleancodeworkshop.domain;

import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;
import training.com.cleancodeworkshop.domain.executor.PostExecutionThread;
import training.com.cleancodeworkshop.domain.repository.CalculatorRepository;

/**
 * Created by Semicolon07 on 2/15/2017 AD.
 */

public class PlusCalculateUseCase {

    private PostExecutionThread postExecutionThread;
    private CalculatorRepository repository;

    public PlusCalculateUseCase(PostExecutionThread postExecutionThread,
                                CalculatorRepository repository){
        this.postExecutionThread = postExecutionThread;
        this.repository = repository;
    }

    public void execute(final RequestValue requestValue, Observer observer){
        repository.plus(requestValue.getNum1(),requestValue.getNum2())
                .subscribeOn(Schedulers.newThread())
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
