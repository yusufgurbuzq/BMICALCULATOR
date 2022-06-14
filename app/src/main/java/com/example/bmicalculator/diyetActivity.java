package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diyetActivity extends AppCompatActivity {

    Button dytGeri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyet);
       // dytGeri=findViewById(R.id.dytGeri);

        /*dytGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( diyetActivity.this, sonucActivity.class);
                startActivity(intent);
                finish();
            }
        });*/

    }
}