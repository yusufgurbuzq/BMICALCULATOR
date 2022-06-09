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

public class MainActivity extends AppCompatActivity {

    EditText editTextKilo,editTextBoy;
    TextView txtSonuc;
    Button hesapla , btnHesapla;
    float s1 , s2;
    float bmi;
    String boy , kilo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextBoy = findViewById(R.id.editTextBoy);
        editTextKilo = findViewById(R.id.editTextKilo);
        hesapla = findViewById(R.id.btnHesapla);
        txtSonuc = findViewById(R.id.txtSonuc);


    }
    public void  hesapla(){


        boy = editTextBoy.getText().toString();
        kilo = editTextKilo.getText().toString();

        if (!TextUtils.isEmpty(boy) && !TextUtils.isEmpty(kilo)) {


            s1 = Float.valueOf(boy);
            s2 = Float.valueOf(kilo);
            bmi = s2 / (s1 * s1);



            if (bmi < 18.5) {
                txtSonuc.setTextColor(getColor(R.color.mavi));
                txtSonuc.setText(bmi + " zayıf");
            }
            if (bmi > 18.5 && bmi <= 24.9) {
                txtSonuc.setTextColor(getColor(R.color.yesil));
                txtSonuc.setText(bmi + " normal");
            }

            if (bmi >= 25 && bmi <= 29.9) {
                txtSonuc.setTextColor(getColor(R.color.sari));
                txtSonuc.setText(bmi + " şişman");
            }
            if (bmi >= 30 && bmi <= 34.9) {
                txtSonuc.setTextColor(getColor(R.color.turuncu));
                txtSonuc.setText(bmi + " Obez");
            }
            if (bmi >=35 ) {
                txtSonuc.setTextColor(getColor(R.color.kirmizi));
                txtSonuc.setText(bmi + " Aşırı Obez");
            }



        }

    }








    public void btnClick(View v){
        hesapla();
    }
}