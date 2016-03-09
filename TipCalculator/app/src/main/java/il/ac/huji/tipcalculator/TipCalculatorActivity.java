package il.ac.huji.tipcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;



public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        Button bt = (Button) findViewById(R.id.btnCalculate);
        bt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox ch = (CheckBox) findViewById(R.id.chkRound);
                EditText ed = (EditText) findViewById(R.id.edtBillAmount);
                EditText res = (EditText) findViewById(R.id.txtTipResult);
                if(ed.getText().toString().equals("")){
                    res.setText("");
                }
                else {
                    double result = Double.parseDouble(ed.getText().toString()) * 0.12;
                    if (ch.isChecked()) {
                        res.setText('$' + Double.toString(Math.round(result)));
                    } else {
                        res.setText('$' + Double.toString(result));

                    }
                }
            }
        });
    }
}
