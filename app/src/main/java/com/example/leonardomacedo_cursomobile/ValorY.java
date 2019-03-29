package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class ValorY extends AppCompatActivity {

    private EditText valorX;
    private TextView resultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_y);
        valorX = findViewById(R.id.editValorX);
        resultadoTxt = findViewById(R.id.textValorY);
    }

    public void CalculaY(View v)
    {
        double x = Double.parseDouble(valorX.getText().toString());
        double resultado = 8 / (2 - x);
        resultadoTxt.setText(String.format(Locale.US,"O valor de Y é %.2f.",resultado));
    }
}
