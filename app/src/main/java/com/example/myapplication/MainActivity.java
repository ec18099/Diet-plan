package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Button btnToWG = (Button) findViewById(R.id.button1);
        btnToWG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnToWG");

                Intent intent= new Intent(MainActivity.this, weightgain.class);
                startActivity(intent);
            }
        });
        Button btnToWL = (Button) findViewById(R.id.button2);
        btnToWL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnToWL");

                Intent intent= new Intent(MainActivity.this, weightL.class);
                startActivity(intent);
            }
        });
        Button btnToMW = (Button) findViewById(R.id.button3);
        btnToMW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked btnToMW");

                Intent intent= new Intent(MainActivity.this, MW.class);
                startActivity(intent);
            }
        });

    }
}
