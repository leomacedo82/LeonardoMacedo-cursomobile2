package com.example.leonardomacedo_cursomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculoGasolina extends AppCompatActivity {

    private EditText modelo,
                distancia,
                potencia,
                valorLitro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_gasolina);
        modelo = findViewById(R.id.editModelo);
        distancia = findViewById(R.id.editDistancia);
        potencia = findViewById(R.id.editPotencia);
        valorLitro = findViewById(R.id.editValorLitro);
    }

    public void CalculaGasolina(View v)
    {
        Intent i = new Intent(this, PrecoGasolina.class);
        i.putExtra("modelo", modelo.getText().toString());
        i.putExtra("distancia", Double.parseDouble(distancia.getText().toString()));
        i.putExtra("potencia", Double.parseDouble(potencia.getText().toString()));
        i.putExtra("valorLitro", Double.parseDouble(valorLitro.getText().toString()));
        startActivity(i);
    }
}
