package com.example.leonardomacedo_cursomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class PrecoGasolina extends AppCompatActivity {

    private TextView texto;
    private String resultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preco_gasolina);
        texto = findViewById(R.id.resultadoGasolina);
        Bundle dados = getIntent().getExtras();
        String modelo = dados.getString("modelo");
        double distancia = dados.getDouble("distancia"),
                potencia = dados.getDouble("potencia"),
                valorLitro = dados.getDouble("valorLitro");
        double resultado = 0.0;
        if (potencia <= 1)
        {
            resultado = (distancia / 13.0) * valorLitro;
        }
        else
            if (potencia > 1 && potencia <= 1.4)
            {
                resultado = (distancia / 11.0) * valorLitro;
            }
            else
                if (potencia > 1.4 && potencia <= 1.9)
                {
                    resultado = (distancia / 9.5) * valorLitro;
                }
                else
                    if (potencia < 1.9)
                    {
                        resultado = (distancia / 7.75) * valorLitro;
                    }
        resultadoTxt = String.format(Locale.US,"%s gasta R$ %.2f para percorrer %.0f km com gasolina a R$ %.3f por litro.", modelo, resultado, distancia, valorLitro);
        texto.setText(resultadoTxt);
    }

    public void compartilhar(View v)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, "ValorGasto");
        i.putExtra(Intent.EXTRA_TEXT, resultadoTxt);
        startActivity(Intent.createChooser(i, "Compartilhar..."));
    }
}
