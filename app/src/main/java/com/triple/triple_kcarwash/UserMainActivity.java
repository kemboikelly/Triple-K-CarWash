package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserMainActivity extends AppCompatActivity {
    Button btnBodyWash,btnExecutiveCln,btnCapetCln,btnSofaCln,btnUnderWash,btnEngWash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        btnBodyWash = findViewById(R.id.btnBdyWash);
        btnExecutiveCln = findViewById(R.id.btnExecutiveCln);
        btnSofaCln = findViewById(R.id.btnSofaCln);
        btnUnderWash = findViewById(R.id.btnUnderWash);
        btnEngWash = findViewById(R.id.btnEngineWash);



        btnUnderWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,UnderWashActivity.class);
                startActivity(intent);
            }
        });
        btnEngWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,EngineWashActivity.class);
                startActivity(intent);
            }
        });
        btnBodyWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,BodyCleaningActivity.class);
                startActivity(intent);
            }
        });
        btnExecutiveCln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,ExecutiveCleaningActivity.class);
                startActivity(intent);
            }
        });

        btnCapetCln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,CapetCleaningActivity.class);
                startActivity(intent);
            }
        });

        btnSofaCln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this,SofaSetActivity.class);
                startActivity(intent);
            }
        });
    }
}