package com.example.leonardomacedo_cursomobile;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class CalculoPeso extends AppCompatActivity {

    private EditText altura;
    private TextView resultado;
    private RadioGroup rdGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_peso);
        altura = findViewById(R.id.Altura_editText);
        resultado = findViewById(R.id.Resultado_textView);
        rdGroupSexo = findViewById(R.id.radioGroup_sexo);
    }

    public void calculaPeso(View v){
        double res;
        double valorAltura = Double.parseDouble(altura.getText().toString());
        if(rdGroupSexo.getCheckedRadioButtonId() == R.id.Masculino_radioButton){
            res = (72.7 * valorAltura) - 58;
        }else{
            res = (62.1 * valorAltura) - 44.7;
        }
        String texto = "O Seu peso ideal é: " + res;
        resultado.setText(texto);
    }

}
