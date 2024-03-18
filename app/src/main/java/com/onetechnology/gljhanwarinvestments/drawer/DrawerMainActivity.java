package com.onetechnology.gljhanwarinvestments.drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.dashboardPages.DashboardActivity;
import com.onetechnology.gljhanwarinvestments.dashboardPages.PortfolioActivity;
import com.onetechnology.gljhanwarinvestments.drawerPages.OrderAndHistoryActivity;

public class DrawerMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_main);
        getSupportActionBar().hide();

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
        Intent intent = new Intent(DrawerMainActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish();

    }
}