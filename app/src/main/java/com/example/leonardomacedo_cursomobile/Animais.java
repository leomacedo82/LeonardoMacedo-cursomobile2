package com.example.leonardomacedo_cursomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Animais extends AppCompatActivity {

    Spinner spin_cat1,
            spin_cat2,
            spin_cat3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animais);
        spin_cat1 = findViewById(R.id.spinner_cat1);
        spin_cat2 = findViewById(R.id.spinner_cat2);
        spin_cat3 = findViewById(R.id.spinner_cat3);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.animal_nivel1_spin,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_cat1.setAdapter(adapter1);
        //spin_cat1.setOnItemClickListener();
    }

    /* ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.planets_array,android.R.layout.simple_spinner_item);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(adapter); */

}
