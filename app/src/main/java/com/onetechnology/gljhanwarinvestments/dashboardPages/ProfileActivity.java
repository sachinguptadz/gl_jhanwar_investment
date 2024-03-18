package com.onetechnology.gljhanwarinvestments.dashboardPages;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import com.onetechnology.gljhanwarinvestments.LoginActivity;
import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.RegistarionActivity;
import com.onetechnology.gljhanwarinvestments.drawerPages.ChangePasswordActivity;
import com.onetechnology.gljhanwarinvestments.drawerPages.UpdateProfileActivity;

public class ProfileActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    MaterialCardView cv_updateProfile,cv_chnagePassword;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle("Profile info");
        getSupportActionBar().hide();
        findViewByIds();

        cv_updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, UpdateProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });
        cv_chnagePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.nav_profile);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_portfolio:
                        startActivity(new Intent(getApplicationContext(), PortfolioActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profile:
                        return true;

                }
                return false;
            }
        });
    }

    private void findViewByIds() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        cv_updateProfile=findViewById(R.id.cv_updateProfile);
        cv_chnagePassword=findViewById(R.id.cv_chnagePassword);
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
        Intent intent = new Intent(ProfileActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();

    }
}