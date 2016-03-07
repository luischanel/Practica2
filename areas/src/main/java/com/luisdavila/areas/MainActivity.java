package com.luisdavila.areas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int op=0;
    int dis=0;
    TextView eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = (Button) findViewById(R.id.eCalcular);

        final EditText eNum1 = (EditText) findViewById(R.id.eDato1);
        final EditText eNum2 = (EditText) findViewById(R.id.eDato2);
        eText = (TextView) findViewById(R.id.eResultado);
        if(dis==0){
            eText.setText("Seleccione una figura");
            dis=1;
        }

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, res;
                if(eNum1.getText().toString().trim().length() > 0) {
                    if (op == 1) {
                        n1 = Double.parseDouble(eNum1.getText().toString());
                        res = n1 * n1;
                        eText.setText("El valor del area es:" + String.valueOf(res));
                    }

                    if (op == 4) {
                        n1 = Double.parseDouble(eNum1.getText().toString());
                        res = n1 * 2.1415;
                        eText.setText("El valor del area es:" + String.valueOf(res));
                    }


                    if (eNum2.getText().toString().trim().length() > 0) {

                        if (op == 2) {
                            n1 = Double.parseDouble(eNum1.getText().toString());
                            n2 = Double.parseDouble(eNum2.getText().toString());
                            res = n1 * n2;
                            eText.setText("El valor del area es:" + String.valueOf(res));
                        }
                        if (op == 3) {
                            n1 = Double.parseDouble(eNum1.getText().toString());
                            n2 = Double.parseDouble(eNum2.getText().toString());
                            res = n1 * n2;
                            eText.setText("El valor del area es:" + String.valueOf(res));
                        }
                    }
                }

            }

        });








    }

    public void cuadrado(){
        final EditText eNum1 = (EditText) findViewById(R.id.eDato1);
        final EditText eNum2 = (EditText) findViewById(R.id.eDato2);
        eNum1.setHint("Lado");
        eNum2.setHint("");
        eNum1.setText("");
        eNum2.setText("");
        eNum2.setEnabled(false);
        eText.setText("Ingrese datos");

    }

    public void triangulo(){
        final EditText eNum1 = (EditText) findViewById(R.id.eDato1);
        final EditText eNum2 = (EditText) findViewById(R.id.eDato2);
        eNum1.setHint("Base");
        eNum2.setHint("Altura");
        eNum1.setText("");
        eNum2.setText("");
        eNum2.setEnabled(true);
        eText.setText("Ingrese datos");
    }

    public void rectangulo(){
        final EditText eNum1 = (EditText) findViewById(R.id.eDato1);
        final EditText eNum2 = (EditText) findViewById(R.id.eDato2);
        eNum1.setHint("Lado 1");
        eNum2.setHint("Lado 2");
        eNum1.setText("");
        eNum2.setText("");
        eNum2.setEnabled(true);
        eText.setText("Ingrese datos");
    }

    public void circulo(){
        final EditText eNum1 = (EditText) findViewById(R.id.eDato1);
        final EditText eNum2 = (EditText) findViewById(R.id.eDato2);
        eNum1.setHint("Radio");
        eNum2.setHint("");
        eNum1.setText("");
        eNum2.setText("");
        eNum2.setEnabled(false);
        eText.setText("Ingrese datos");
        }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_cua:
                if (checked)
                    op=1;
                    cuadrado();
                break;
            case R.id.radio_tri:
                if (checked)
                    op=2;
                    triangulo();
                break;
            case R.id.radio_rec:
                if (checked)
                    op=3;
                    rectangulo();
                break;
            case R.id.radio_cir:
                if (checked)
                    op=4;
                    circulo();
                break;

        }
    }



}
