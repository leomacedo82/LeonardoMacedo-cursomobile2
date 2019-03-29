package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class PesoPlaneta extends AppCompatActivity {

    private EditText pesoTerra;
    private Spinner spinPlanetas;
    private TextView resultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_planeta);
        pesoTerra = findViewById(R.id.editPesoTerra);
        spinPlanetas = findViewById(R.id.spinPlanetas);
        resultadoTxt = findViewById(R.id.textResultadoPesoPlaneta);
    }

    public void CalculaPesoPlaneta (View v)
    {
        double pesoNaTerra = Double.parseDouble(pesoTerra.getText().toString());
        double gravidades[] = {0.37, 0.88, 0.38, 2.64, 1.15, 1.17};
        double resultado = (pesoNaTerra / 10) * gravidades[spinPlanetas.getSelectedItemPosition()];
        String resultadoString = String.format(Locale.US, "O seu peso no Planeta %s equivale a %.2f Kg.", spinPlanetas.getSelectedItem().toString(), resultado);
        resultadoTxt.setText(resultadoString);
    }
}
