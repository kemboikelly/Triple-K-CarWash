package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BodyCleaningActivity extends AppCompatActivity {
    Button btnBack;
    TextView tvTruckBod,tvLorrBody,tvBigCarBody,tvSaloonBody,tvMotoCyBody,tvBicyclBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_cleaning);
        tvTruckBod = findViewById(R.id.tvTruckBod);
        tvLorrBody = findViewById(R.id.tvLorrBody);
        tvBigCarBody = findViewById(R.id.tvBigCarBody);
        tvSaloonBody = findViewById(R.id.tvSaloonBody);
        tvMotoCyBody = findViewById(R.id.tvMotoCyBody);
        tvBicyclBody = findViewById(R.id.tvBicyclBody);

        tvTruckBod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvLorrBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvBigCarBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvSaloonBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvMotoCyBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvBicyclBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BodyCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

    }
}