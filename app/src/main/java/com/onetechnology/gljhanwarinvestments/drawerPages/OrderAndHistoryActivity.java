package com.onetechnology.gljhanwarinvestments.drawerPages;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.adapters.RVMyAssetsAdapter;
import com.onetechnology.gljhanwarinvestments.adapters.RVOrderAndHistoryAdapter;
import com.onetechnology.gljhanwarinvestments.dashboardPages.PortfolioActivity;

public class OrderAndHistoryActivity extends AppCompatActivity {
    RecyclerView rv_orderAndHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_and_history);
        getSupportActionBar().hide();
        findViewByIds();

        RVOrderAndHistoryAdapter rvOrderAndHistoryAdapter = new RVOrderAndHistoryAdapter(OrderAndHistoryActivity.this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(OrderAndHistoryActivity.this, LinearLayoutManager.VERTICAL, false);
        rv_orderAndHistory.setLayoutManager(linearLayoutManager);
        rv_orderAndHistory.setAdapter(rvOrderAndHistoryAdapter);
    }

    private void findViewByIds() {
        rv_orderAndHistory = findViewById(R.id.rv_orderAndHistory);
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
        Intent intent = new Intent(OrderAndHistoryActivity.this, PortfolioActivity.class);
        startActivity(intent);
        finish();

    }
}