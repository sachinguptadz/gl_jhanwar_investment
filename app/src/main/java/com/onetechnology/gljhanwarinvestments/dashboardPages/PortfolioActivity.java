package com.onetechnology.gljhanwarinvestments.dashboardPages;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.adapters.RVMyAssetsAdapter;

public class PortfolioActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    RecyclerView rv_assets;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle("Portfolio");
        getSupportActionBar().hide();
        findViewByIds();

        RVMyAssetsAdapter rvMyAssetsAdapter = new RVMyAssetsAdapter(PortfolioActivity.this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(PortfolioActivity.this, LinearLayoutManager.VERTICAL, false);
        rv_assets.setLayoutManager(linearLayoutManager);
        rv_assets.setAdapter(rvMyAssetsAdapter);


        bottomNavigationView.setSelectedItemId(R.id.nav_portfolio);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_portfolio:
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
        rv_assets = findViewById(R.id.rv_assets);

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
        Intent intent = new Intent(PortfolioActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();

    }
}