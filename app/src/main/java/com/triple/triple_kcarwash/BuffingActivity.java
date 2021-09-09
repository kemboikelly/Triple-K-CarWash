package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuffingActivity extends AppCompatActivity {
    TextView tvTruckBuff,tvLorrBuff,tvBigCarBuff,tvSaloonBuff,tvMotoCycleBuff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffing);
        tvTruckBuff = findViewById(R.id.tvTruckBuff);
        tvLorrBuff = findViewById(R.id.tvLorrBuff);
        tvBigCarBuff = findViewById(R.id.tvBigCarBuff);
        tvSaloonBuff = findViewById(R.id.tvSaloonBuff);
        tvMotoCycleBuff = findViewById(R.id.tvMotoCycleBuff);


        tvTruckBuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuffingActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvLorrBuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuffingActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvBigCarBuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuffingActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvSaloonBuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuffingActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        tvMotoCycleBuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuffingActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });

    }
}