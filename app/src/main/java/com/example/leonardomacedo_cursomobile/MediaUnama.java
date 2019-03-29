package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MediaUnama extends AppCompatActivity {

    private EditText nomeTxt,
                        av1Txt,
                        av2Txt;
    private TextView resultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_unama);
        nomeTxt = findViewById(R.id.editNome);
        av1Txt = findViewById(R.id.editNotaAv1);
        av2Txt = findViewById(R.id.editNotaAv2);
        resultadoTxt = findViewById(R.id.textResultadoMediaUnama);
    }

    public void calculaMedia(View v)
    {
        String nome = nomeTxt.getText().toString();
        double av1 = Double.parseDouble(av1Txt.getText().toString());
        double av2 = Double.parseDouble(av2Txt.getText().toString());
        double media = (av1 + av2) / 2;
        String resultado = "";
        if (media < 4)
        {
            resultado = String.format(Locale.US, "%s está Reprovado(a) com média %.2f.", nome, media);
        }
        else
        {
            if (media >= 4 && media < 7)
            {
                resultado = String.format(Locale.US, "%s fará Prova Final com média %.2f.", nome, media);
            }
            else
            {
                if (media >= 7)
                {
                    resultado = String.format(Locale.US, "%s está Aprovado com média %.2f.", nome, media);
                }
            }
        }
        resultadoTxt.setText(resultado);
    }
}
