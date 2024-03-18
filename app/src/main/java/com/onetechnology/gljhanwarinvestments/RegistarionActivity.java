package com.onetechnology.gljhanwarinvestments;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class RegistarionActivity extends AppCompatActivity {

    TextInputEditText et_name, et_mobileNumber, et_email, et_address, et_createPassword, et_confirmPassword;
    LinearLayoutCompat ll_login;
    MaterialTextView tv_alreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registarion);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        findViewByIds();

        tv_alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistarionActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ll_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_name.getText().toString().trim().equals("")) {
                    et_name.setError("Enter name");
                    et_name.requestFocus();
                } else if (et_mobileNumber.getText().toString().trim().equals("")) {
                    et_mobileNumber.setError("Enter mobile number");
                    et_mobileNumber.requestFocus();
                } else if (et_email.getText().toString().trim().equals("")) {
                    et_email.setError("Enter email");
                    et_email.requestFocus();
                } else if (et_address.getText().toString().trim().equals("")) {
                    et_address.setError("Enter address");
                    et_address.requestFocus();
                } else if (et_createPassword.getText().toString().trim().equals("")) {
                    et_createPassword.setError("Enter password");
                    et_createPassword.requestFocus();
                } else if (et_confirmPassword.getText().toString().trim().equals("")) {
                    et_confirmPassword.setError("Enter confirm password");
                    et_confirmPassword.requestFocus();
                } else if (!et_confirmPassword.getText().toString().trim().equals(et_createPassword.getText().toString().trim())) {
                    et_confirmPassword.setError("Password don't match. Please enter same password");
                    et_confirmPassword.requestFocus();
                } else {
                    getRegister();
                }
            }
        });


    }

    private void getRegister() {
        Intent intent = new Intent(RegistarionActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void findViewByIds() {
        ll_login = findViewById(R.id.ll_login);
        et_name = findViewById(R.id.et_name);
        et_mobileNumber = findViewById(R.id.et_mobileNumber);
        et_email = findViewById(R.id.et_email);
        et_address = findViewById(R.id.et_address);
        et_createPassword = findViewById(R.id.et_createPassword);
        et_confirmPassword = findViewById(R.id.et_confirmPassword);
        tv_alreadyHaveAccount = findViewById(R.id.tv_alreadyHaveAccount);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RegistarionActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }
}