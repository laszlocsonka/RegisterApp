package com.fonetic.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogOut = findViewById(R.id.logOutBtn);

        buttonLogOut.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,ActivityLogin.class);
            startActivity(intent);
            finish();
        });
    }


}