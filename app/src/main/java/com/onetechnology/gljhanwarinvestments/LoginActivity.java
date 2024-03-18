package com.onetechnology.gljhanwarinvestments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.onetechnology.gljhanwarinvestments.dashboardPages.DashboardActivity;

public class LoginActivity extends AppCompatActivity {
    MaterialTextView tv_createAccount;
    LinearLayoutCompat ll_register;
    TextInputEditText et_mobileNumber, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        findViewByIds();

        ll_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_mobileNumber.getText().toString().trim().equals("")) {
                    et_mobileNumber.setError("Enter mobile number");
                    et_mobileNumber.requestFocus();
                } else if (et_password.getText().toString().trim().equals("")) {
                    et_password.setError("Enter password");
                    et_password.requestFocus();
                } else {
                    getLogin();
                }

            }
        });


        tv_createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistarionActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void getLogin() {
        Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();
    }

    private void findViewByIds() {
        tv_createAccount = findViewById(R.id.tv_createAccount);
        ll_register = findViewById(R.id.ll_register);

        et_mobileNumber = findViewById(R.id.et_mobileNumber);
        et_password = findViewById(R.id.et_password);
    }
}