package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class imcActivity extends AppCompatActivity {

    String nome ;
    Double peso , altura ;
    TextView tvnome, tvaltura, tvpeso, tvimc;
    DecimalFormat decimalFormat = new DecimalFormat("##, ###, ###, ##0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        
        Bundle bundle = getIntent().getExtras();
        nome = bundle.getString("nome");
        peso = bundle.getDouble("peso");
        altura = bundle.getDouble("altura");
        tvnome = findViewById(R.id.tvnome);
        tvpeso = findViewById(R.id.tvpeso);
        tvaltura = findViewById(R.id.tvaltura);
        tvimc = findViewById(R.id.tvimc);



    }

    @Override
    protected void onStart() {
        super.onStart();

        tvnome.setText(nome);
        tvaltura.setText(altura.toString());
        tvpeso.setText(peso.toString());
        tvimc.setText( decimalFormat.format(calculaIMC(peso,altura).toString()));


    }

    public Double calculaIMC (Double peso, Double altura) {

        Double imc = peso/(altura*altura);
        return imc;

     }

}