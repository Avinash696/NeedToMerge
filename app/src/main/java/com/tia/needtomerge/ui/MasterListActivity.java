package com.tia.needtomerge.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tia.needtomerge.R;

public class MasterListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_list);
//        startActivity(new Intent(this,MasterDetailListActivity.class));
    }

    public void FnAddAsset(View view) {
        startActivity(new Intent(this,MasterDetailListActivity.class));
    }
}