package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ednome, edaltura, edpeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednome=findViewById(R.id.ednome) ;
        edaltura=findViewById(R.id.edaltura);
        edpeso=findViewById(R.id.edpeso);


    }


    public void calculaIMC(View view) {
        Intent i =new Intent(this, imcActivity.class );
        String nome = ednome.getText().toString();
        Double peso = Double.parseDouble(edpeso.getText().toString());
        Double altura = Double.parseDouble(edaltura.getText().toString());
        i.putExtra("nome" , nome);
        i.putExtra("peso", peso);
        i.putExtra("altura", altura);

        startActivity(i);
    }
}