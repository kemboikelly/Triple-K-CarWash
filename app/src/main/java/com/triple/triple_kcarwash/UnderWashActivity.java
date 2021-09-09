package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UnderWashActivity extends AppCompatActivity {
    TextView tvTruckUnd,tvMattuUnd,tvSlnUnd,tvTktkUnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_wash);
        tvTruckUnd = findViewById(R.id.tvtruckUnd);
        tvMattuUnd = findViewById(R.id.tvMatUnd);
        tvSlnUnd = findViewById(R.id.tvSalnUnd);
        tvTktkUnd = findViewById(R.id.tvTukUnd);



        tvTruckUnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvMattuUnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvSlnUnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

        tvTktkUnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnderWashActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
    }
}