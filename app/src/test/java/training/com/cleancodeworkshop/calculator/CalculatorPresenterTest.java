package training.com.cleancodeworkshop.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Created by Semicolon07 on 2/9/2017 AD.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorPresenterTest {
    private CalculatorContract.Presenter mockPresenter;
    @Mock private CalculatorContract.View mockView;

    @Before
    public void setUp(){
        mockPresenter = new CalculatorPresenter();
        mockPresenter.attachView(mockView);
    }

    @Test
    public void testPlus(){
        mockPresenter.plus("1","2");
        verify(mockView).showLoadingProgress();
    }

}