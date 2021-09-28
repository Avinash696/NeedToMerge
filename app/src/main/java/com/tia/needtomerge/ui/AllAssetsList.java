package com.tia.needtomerge.ui;

import static com.tia.needtomerge.constant.constants.ASSET_CODE;
import static com.tia.needtomerge.constant.constants.ASSET_NAME;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tia.needtomerge.AllAssetsClickListener;
import com.tia.needtomerge.R;
import com.tia.needtomerge.TicketClickListener;
import com.tia.needtomerge.adapter.AllAssetsListAdapter;
import com.tia.needtomerge.adapter.TicketListAdapter;
import com.tia.needtomerge.databinding.ActivityAllAssetsListBinding;
import com.tia.needtomerge.model.AllAssetsListModel;
import com.tia.needtomerge.model.TicketListModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AllAssetsList extends AppCompatActivity implements AllAssetsClickListener {
    ActivityAllAssetsListBinding binding;
    AllAssetsListAdapter allAssetsListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("All Assets List");
       binding= DataBindingUtil. setContentView(this,R.layout.activity_all_assets_list);
//        initToolbar();
        setAdapter();
    }


//    private void initToolbar() {
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setTitle("Tagging List");
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
//    }
    private void populateData() {
        List<AllAssetsListModel> dataModelList = new ArrayList<>();

        dataModelList.add(new AllAssetsListModel("104000024", "PROCUREMENT OF TRESTLE - AMD"));
        dataModelList.add(new AllAssetsListModel("112000025", "NOTE COUNTING MACHINE CRUSADER LIGHT"));
        dataModelList.add(new AllAssetsListModel("112000104", "CO2 SQUEEZE FIRE EXT- 4.5KG 1 AMD"));
        dataModelList.add(new AllAssetsListModel("112000962", "HIKVISION IP IR DOME CAMERA"));
        dataModelList.add(new AllAssetsListModel("112000963", "HIKVISION IP IR DOME CAMERA"));
        dataModelList.add(new AllAssetsListModel("112000964", "HIKVISION IP IR DOME CAMERA"));

        allAssetsListAdapter = new AllAssetsListAdapter(dataModelList, this, this);
        binding.recyclerView.setAdapter(allAssetsListAdapter);
        allAssetsListAdapter.notifyDataSetChanged();
    }

    private void setAdapter() {
        Log.d("rawat", "setAdapter: ");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(linearLayoutManager);
        populateData();
    }

    @Override
    public void cardClicked(AllAssetsListModel f) {
        Log.d("rawat", "cardClicked: ");
        Intent intent = new Intent(AllAssetsList.this, AllAssetsDetail.class);
        intent.putExtra(ASSET_CODE,""+f.tagCode);
        intent.putExtra(ASSET_NAME,""+f.tagName);
        startActivity(intent);
    }


//    public void FnNewTicket(View view) {
//        startActivity(new Intent(this,TicketDetailActivity.class));
//    }
}