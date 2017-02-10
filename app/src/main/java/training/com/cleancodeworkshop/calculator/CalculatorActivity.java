package training.com.cleancodeworkshop.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import training.com.cleancodeworkshop.R;
import training.com.cleancodeworkshop.calculator.result.ResultActivity;

public class CalculatorActivity extends AppCompatActivity implements CalculatorFragment.Listener {

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

    @Override
    public void nextPage() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
