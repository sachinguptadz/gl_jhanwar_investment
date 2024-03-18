package com.onetechnology.gljhanwarinvestments.drawerPages;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.onetechnology.gljhanwarinvestments.LoginActivity;
import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.RegistarionActivity;
import com.onetechnology.gljhanwarinvestments.dashboardPages.ProfileActivity;

public class UpdateProfileActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Update profile");
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
        Intent intent = new Intent(UpdateProfileActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();

    }
}