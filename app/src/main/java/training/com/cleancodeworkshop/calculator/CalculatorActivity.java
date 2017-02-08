package training.com.cleancodeworkshop.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import training.com.cleancodeworkshop.R;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        if(null == savedInstanceState){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, CalculatorFragment.newInstance())
                    .commit();
        }
    }
}
