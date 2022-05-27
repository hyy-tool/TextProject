package com.example.textproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hytool.ClickOnThe;

public class MainActivity extends AppCompatActivity implements ClickOnThe {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}