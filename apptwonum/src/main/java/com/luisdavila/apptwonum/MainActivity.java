package com.luisdavila.apptwonum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int op=0;
    TextView eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (TextView) findViewById(R.id.textview1);
        final EditText eNum1 = (EditText) findViewById(R.id.text_n1);
        final EditText eNum2 = (EditText) findViewById(R.id.text_n2);
        Button bSend = (Button) findViewById(R.id.button1);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, res;

                if(op==1) {
                    n1 = Double.parseDouble(eNum1.getText().toString());
                    n2 = Double.parseDouble(eNum2.getText().toString());
                    res = n1 + n2;
                    eText.setText(String.valueOf(res));
                }
                if(op==2) {
                    n1 = Double.parseDouble(eNum1.getText().toString());
                    n2 = Double.parseDouble(eNum2.getText().toString());
                    res = n1 - n2;
                    eText.setText(String.valueOf(res));
                }
                if(op==3) {
                    n1 = Double.parseDouble(eNum1.getText().toString());
                    n2 = Double.parseDouble(eNum2.getText().toString());
                    res = n1 * n2;
                    eText.setText(String.valueOf(res));
                }
                if(op==4) {
                    n1 = Double.parseDouble(eNum1.getText().toString());
                    n2 = Double.parseDouble(eNum2.getText().toString());
                    res = n1 / n2;
                    eText.setText(String.valueOf(res));
                }

            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_sum:
                if (checked)
                    op=1;
                break;
            case R.id.radio_rest:
                if (checked)
                    op=2;
                break;
            case R.id.radio_mul:
                if (checked)
                    op=3;
                break;
            case R.id.radio_div:
                if (checked)
                    op=4;
                break;

        }
    }


}
