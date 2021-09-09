package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExecutiveCleaningActivity extends AppCompatActivity {
    Button btnTruckUnderPri,btnLorrUndPri,btnBigCarUndPri,btnSaloonUndPri,btnMotocyEngPri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executive_cleaning);
        btnTruckUnderPri = findViewById(R.id.btnTruckUnderPri);
        btnLorrUndPri = findViewById(R.id.btnLorrUndPri);
        btnBigCarUndPri = findViewById(R.id.btnBigCarUndPri);
        btnSaloonUndPri = findViewById(R.id.btnSaloonUndPri);
        btnMotocyEngPri = findViewById(R.id.btnMotocyEngPri);

        btnTruckUnderPri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExecutiveCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        btnLorrUndPri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExecutiveCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        btnBigCarUndPri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExecutiveCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        btnSaloonUndPri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExecutiveCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
        btnMotocyEngPri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExecutiveCleaningActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
    }

}