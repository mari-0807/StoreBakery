package com.example.storebakery;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class TimerTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timertask);

        java.util.TimerTask tarea = new java.util.TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(TimerTask.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }
}