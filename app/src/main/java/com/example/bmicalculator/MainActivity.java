package com.example.bmicalculator;



import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button hesapla , btnHesapla;
    EditText kilo,boy;

    String kilo1,boy1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesapla = findViewById(R.id.btnHesapla);
        kilo = findViewById(R.id.editTextKilo);
        boy = findViewById(R.id.editTextBoy);





        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gboy,gkilo;
                gboy = boy.getText().toString();
                gkilo = kilo.getText().toString();


                if(TextUtils.isEmpty(kilo.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Lütfen Kilonuzu Giriniz", Toast.LENGTH_SHORT).show();
                }

                else if(TextUtils.isEmpty(boy.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Lütfen Boyunuzu Giriniz", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent intent = new Intent(MainActivity.this, sonucActivity.class);
                    intent.putExtra("boy",gboy);
                    intent.putExtra("kilo",gkilo);
                    startActivity(intent);

                }



            }

        });

    }

}

