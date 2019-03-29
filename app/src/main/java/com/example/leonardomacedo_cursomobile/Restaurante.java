package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Restaurante extends AppCompatActivity {

    private EditText nomeTxt,
                        valorContaTxt;
    private TextView descontoResultadoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        nomeTxt = findViewById(R.id.editNomeRestaurante);
        valorContaTxt = findViewById(R.id.editValorConta);
        descontoResultadoTxt = findViewById(R.id.textDesconto);
    }

    public void executar(View v)
    {
        if (nomeTxt.getText().toString().isEmpty())
        {
            nomeTxt.setError("Campo Vazio");
        }
        else
        {
            if (valorContaTxt.getText().toString().isEmpty())
            {
                valorContaTxt.setError("Campo Vazio");
            }
            else
            {
                verificarDesconto(v);
            }
        }
    }

    public void verificarDesconto(View v)
    {
        String inicial;
        String resultado;
        inicial = nomeTxt.getText().toString().substring(0,1);
        inicial = inicial.toLowerCase();
        inicial = inicial.replaceFirst("[áàãâ]","a");
        inicial = inicial.replaceFirst("[èéẽê]","e");
        inicial = inicial.replaceFirst("[ìíĩî]","i");
        inicial = inicial.replaceFirst("[òóõô]","o");
        inicial = inicial.replaceFirst("[ùúũû]","u");

        if (inicial.equals("a") || inicial.equals("e") || inicial.equals("i") || inicial.equals("o") || inicial.equals("u"))
        {
            double valorConta = Double.parseDouble(valorContaTxt.getText().toString());
            double valorFinal = valorConta - (valorConta * 0.3);
            resultado = String.format(Locale.US,"Parabéns, você vai pagar somente R$ %.2f .", valorFinal);
        }
        else
        {
            resultado = "Que pena! Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.";
        }
        descontoResultadoTxt.setText(resultado);
    }
}
