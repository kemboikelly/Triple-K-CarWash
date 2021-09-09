package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInsActivity extends AppCompatActivity {
    Button mBtnUserLogin,mBtnAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_ins);
        mBtnUserLogin = findViewById(R.id.btnUserLogin);
        mBtnAdminLogin = findViewById(R.id.btnAdminLogin);

        mBtnUserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInsActivity.this,UserLogInActivity.class);
                startActivity(intent);
            }
        });
        mBtnAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LogInsActivity.this,AdminLogInActivity.class);
                startActivity(intent2);
            }
        });
    }
}