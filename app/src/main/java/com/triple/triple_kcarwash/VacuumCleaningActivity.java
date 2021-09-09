package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VacuumCleaningActivity extends AppCompatActivity {
    TextView tvTruckVcm,tvBusMvcm,tvSlnCrVcm,tvTkMtVcm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacuum_cleaning);
        tvTruckVcm = findViewById(R.id.tvTruckVcm);
        tvBusMvcm = findViewById(R.id.tvBusMvcm);
        tvSlnCrVcm = findViewById(R.id.tvSlnCrVcm);
        tvTkMtVcm = findViewById(R.id.tvTkMtVcm);


        tvTruckVcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacuumCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvBusMvcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacuumCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvSlnCrVcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacuumCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvTkMtVcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacuumCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
    }
}