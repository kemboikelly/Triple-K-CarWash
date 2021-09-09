package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SofaSetActivity extends AppCompatActivity {
    Button BtnSofaCln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa_set);

        BtnSofaCln = findViewById(R.id.btnSofaClnPri);


        BtnSofaCln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SofaSetActivity.this,PaymentsActivity.class);
                startActivity(intent);
            }
        });
    }
}