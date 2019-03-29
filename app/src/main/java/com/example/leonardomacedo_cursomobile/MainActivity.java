package com.example.leonardomacedo_cursomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        options = findViewById(R.id.spinnerActivity);
    }

    public void executaActivity(View v) {
        int posicao = options.getSelectedItemPosition();
        Class lista[] = {CalculoPeso.class,
                            Operadora.class,
                            Animais.class,
                            PesoPlaneta.class,
                            ValorY.class,
                            MediaUnama.class,
                            CategoriaNatacao.class,
                            Restaurante.class,
                            CalculoGasolina.class};

        Intent i = new Intent(this, lista[posicao]);
        startActivity(i);
    }
}
