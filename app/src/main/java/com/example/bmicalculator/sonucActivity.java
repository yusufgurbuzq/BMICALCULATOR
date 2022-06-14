package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sonucActivity extends AppCompatActivity {

    Button geri, btnGeri,btnEgz,btnDiyet;
    TextView sonuc;
    private String gelenBoy , gelenKilo;
    float skilo,sboy,bmi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);
        btnEgz = findViewById(R.id.btnEgz);
        btnDiyet=findViewById(R.id.btnDiyet);

        sonuc = findViewById(R.id.txtSonuc);

        Intent intent = getIntent();
        gelenBoy = intent.getStringExtra("boy");
        gelenKilo = intent.getStringExtra("kilo");
        geri = findViewById(R.id.btnGeri);

        sboy = Float.valueOf(gelenBoy);
        skilo = Float.valueOf(gelenKilo);
        sboy=sboy/100;
        bmi = skilo / (sboy * sboy);

        if (bmi < 18.5) {
            sonuc.setTextColor(getColor(R.color.mavi));
            sonuc.setText(bmi + "\nzayıf");
        }
        if (bmi > 18.5 && bmi <= 24.99) {
            sonuc.setTextColor(getColor(R.color.yesil));
            sonuc.setText(bmi + "\nnormal");
        }

        if (bmi >= 25 && bmi <= 29.99) {
            sonuc.setTextColor(getColor(R.color.sari));
            sonuc.setText(bmi + "\nşişman");
        }
        if (bmi >= 30 && bmi <= 34.99) {
            sonuc.setTextColor(getColor(R.color.turuncu));
            sonuc.setText(bmi + "\nObez");
        }
        if (bmi >=35 ) {
            sonuc.setTextColor(getColor(R.color.kirmizi));
            sonuc.setText(bmi + "\nAşırı Obez");
        }



        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sonucActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnEgz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sonucActivity.this, egzActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnDiyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sonucActivity.this, diyetActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}