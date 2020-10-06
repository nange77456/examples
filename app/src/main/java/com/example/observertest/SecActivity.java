package com.example.observertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.patternlib.Bus;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Bus.send("main","我是second。");
    }
}