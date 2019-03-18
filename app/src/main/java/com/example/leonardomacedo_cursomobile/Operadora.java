package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Operadora extends AppCompatActivity {

    private EditText min;
    private Spinner options;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadora);
        min = findViewById(R.id.min_edit);
        options = findViewById(R.id.op_spin);
        resultado = findViewById(R.id.resultado_op);
    }

    public void calculaMin(View v){
        double resultadoText = 0;
        double segundos = (Double.parseDouble(min.getText().toString()) * 60) - 5;

        switch (options.getSelectedItemPosition())
        {
            case 0:
                resultadoText = segundos * 0.020;
                break;
            case 1:
                resultadoText = segundos * 0.025;
                break;
            case 2:
                resultadoText = segundos * 0.019;
                break;
        }
        String result = "O valor da ligação é: " + resultadoText + " reais.";
        resultado.setText(result);
    }
}
