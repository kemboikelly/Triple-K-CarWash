package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CapetCleaningActivity extends AppCompatActivity {
    TextView tvLargeWas,tvMidWas,tvSmallWas,tvLargeHov,tvMidHov,tvSmallHv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capet_cleaning);
        tvLargeWas = findViewById(R.id.tvLargeWas);
        tvMidWas = findViewById(R.id.tvMidWas);
        tvSmallWas = findViewById(R.id.tvSmallWas);
        tvLargeHov = findViewById(R.id.tvLargeHov);
        tvMidHov = findViewById(R.id.tvMidHov);
        tvSmallHv = findViewById(R.id.tvSmallHv);

        tvLargeWas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvMidWas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvSmallWas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvLargeHov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvMidHov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvSmallHv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapetCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

    }

}