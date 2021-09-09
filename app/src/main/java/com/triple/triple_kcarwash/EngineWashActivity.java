package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EngineWashActivity extends AppCompatActivity {
    TextView tvTruckEng,tvMattuEng,tvSlonEng,tvTktkEng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_wash);
        tvTruckEng = findViewById(R.id.tvTruckEng);
        tvMattuEng = findViewById(R.id.tvMatatuEng);
        tvSlonEng = findViewById(R.id.tvSalonEng);
        tvTktkEng = findViewById(R.id.tvTukTukEng);



        tvTruckEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvMattuEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvSlonEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvTktkEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
    }
}