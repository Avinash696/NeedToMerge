package com.tia.needtomerge.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tia.needtomerge.R;
import com.tia.needtomerge.TicketClickListener;
import com.tia.needtomerge.adapter.TicketListAdapter;
import com.tia.needtomerge.databinding.ActivityMasterDetailListBinding;
import com.tia.needtomerge.databinding.ActivityMasterListBinding;
import com.tia.needtomerge.model.TicketListModel;

import java.util.ArrayList;
import java.util.List;

public class MasterListActivity extends AppCompatActivity implements TicketClickListener {
    TicketListAdapter ticketListAdapter;

    ActivityMasterListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil. setContentView(this,R.layout.activity_master_list);
       setAdapter();
    }
    private void populateData() {
        Log.d("rawat", "populateData: ");
        List<TicketListModel> dataModelList = new ArrayList<>();

        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Description"));
        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Descrption"));
        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Descroption"));
        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Descption"));
        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Descrtion"));
        dataModelList.add(new TicketListModel("Assets", "AsignTo", "Status", "Title", "Image", "Deson"));

        //call adapter
        ticketListAdapter = new TicketListAdapter(dataModelList, this, this);
        binding.rvTicketList.setAdapter(ticketListAdapter);
        ticketListAdapter.notifyDataSetChanged();
    }

    private void setAdapter() {
        Log.d("rawat", "setAdapter: ");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rvTicketList.setLayoutManager(linearLayoutManager);
        populateData();
    }

    @Override
    public void cardClicked(TicketListModel f) {

    }

    public void FnAddAseetsToDetail(View view) {
        startActivity(new Intent(this, MasterDetailListActivity.class));
    }
}