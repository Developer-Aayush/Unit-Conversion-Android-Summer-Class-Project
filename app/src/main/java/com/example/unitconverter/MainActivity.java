package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent( MainActivity.this, ConversionPart.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button buttonDistanceConv = findViewById(R.id.buttonDistanceConv);
        buttonDistanceConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentDistance = new Intent( MainActivity.this, MainActivityForDistance.class);
                MainActivity.this.startActivity(myIntentDistance);
            }
        });
    }
}