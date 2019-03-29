package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CategoriaNatacao extends AppCompatActivity {

    private EditText idadeTxt;
    private TextView categoriaEscolhidaTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_natacao);
        idadeTxt = findViewById(R.id.editIdadeNatacao);
        categoriaEscolhidaTxt = findViewById(R.id.textCategoria);
    }

    public void determinaCategoria(View v)
    {
        int idade = Integer.parseInt(idadeTxt.getText().toString());
        String categoria;
        if (idade < 5)
            categoria = "Você ainda é um bebê, vá brincar.";
        else
        {
            if (idade <= 7)
            {
                categoria = "Você está na categoria Infantil A.";
            }
            else
            {
                if (idade <= 10)
                {
                    categoria = "Você está na categoria Infantil B.";
                }
                else
                {
                    if (idade <= 13)
                    {
                        categoria = "Você está na categoria Juvenil A.";
                    }
                    else
                    {
                        if (idade <= 17)
                        {
                            categoria = "Você está na categoria Juvenil B.";
                        }
                        else
                        {
                            categoria = "Você está na categoria Sênior.";
                        }
                    }
                }
            }
        }
        categoriaEscolhidaTxt.setText(categoria);
    }
}
