package com.tia.needtomerge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tia.needtomerge.databinding.ActivityMainBinding;
import com.tia.needtomerge.ui.AllAssetsList;
import com.tia.needtomerge.ui.MasterListActivity;
import com.tia.needtomerge.ui.TicketListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.btnTicket.setOnClickListener(this);
        binding.btnAllAsset.setOnClickListener(this);
        binding.btnMaster.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_ticket:
                startActivity(new Intent(this, TicketListActivity.class));
                break;
            case R.id.btn_allAsset:
                startActivity(new Intent(this, AllAssetsList.class));
                break;
            case R.id.btn_Master:
                startActivity(new Intent(this, MasterListActivity.class));
                break;

        }
    }
}