package com.onetechnology.gljhanwarinvestments.dashboardPages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.makeramen.roundedimageview.RoundedImageView;
import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.drawer.DrawerMainActivity;

public class DashboardActivity extends AppCompatActivity {
    RoundedImageView img_drawer;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        //  getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().hide();

        findViewByIds();

        img_drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, DrawerMainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        return true;
                    case R.id.nav_portfolio:
                        startActivity(new Intent(getApplicationContext(), PortfolioActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

    private void findViewByIds() {

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        img_drawer = findViewById(R.id.img_drawer);

    }
}