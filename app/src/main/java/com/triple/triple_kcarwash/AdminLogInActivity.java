package com.triple.triple_kcarwash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogInActivity extends AppCompatActivity {
    EditText mEdtAdminUserName, mEdtAdminPassword;
    Button mBtnAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);
        mEdtAdminUserName = findViewById(R.id.edtAdminUsername);
        mEdtAdminPassword = findViewById(R.id.edtAdminPassword);
        mBtnAdminLogin = findViewById(R.id.btnLoginAdmin);

        mBtnAdminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtAdminUserName.getText().toString().trim().equals("Administrator") && mEdtAdminPassword.getText().toString().trim().equals("Admin2021")){
                    Toast.makeText(AdminLogInActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(AdminLogInActivity.this,AdminMainMenuActivity.class);
                    startActivity(intent3);
                    clear();
                } else {
                    Toast.makeText(AdminLogInActivity.this, "Invalid Login Credentials", Toast.LENGTH_SHORT).show();
                    clear();
                }
            }
        });

    }
    public void clear(){
        mEdtAdminUserName.setText("");
        mEdtAdminPassword.setText("");
    }
}