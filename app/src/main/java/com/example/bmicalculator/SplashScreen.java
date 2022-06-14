package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timerThread = new Thread(){ //timer kullanarak ekranın 5 saniye sonra diğer ekrana geçmesini söyliyorum
            public void run(){
                try{
                    sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));

                    finish();
                }
                finish();
            }
        };
        timerThread.start();

        }

    }




