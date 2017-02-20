package training.com.cleancodeworkshop.calculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.parceler.Parcels;

import training.com.cleancodeworkshop.R;
import training.com.cleancodeworkshop.StudentModel;
import training.com.cleancodeworkshop.calculator.result.ResultActivity;

public class CalculatorActivity extends AppCompatActivity implements CalculatorFragment.Listener {
    private static final String INTENT_PARAM_STUDENT_MODEL = "INTENT_PARAM_STUDENT_MODEL";

    public static Intent callingIntent(Context context,StudentModel model){
        Intent i = new Intent(context, CalculatorActivity.class);
        i.putExtra(INTENT_PARAM_STUDENT_MODEL, Parcels.wrap(model));

        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        StudentModel model = Parcels.unwrap(getIntent().getParcelableExtra(INTENT_PARAM_STUDENT_MODEL));

        if(null == savedInstanceState){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, CalculatorFragment.newInstance(model))
                    .commit();
        }
    }


    @Override
    public void nextPage() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
