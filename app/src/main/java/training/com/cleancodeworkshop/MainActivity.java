package training.com.cleancodeworkshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import training.com.cleancodeworkshop.calculator.CalculatorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        StudentModel model = new StudentModel();
        model.setName("Nice Nice");

        Intent i = CalculatorActivity.callingIntent(this,model);
        startActivity(i);
    }
}
