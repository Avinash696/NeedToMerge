package com.tia.needtomerge.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.tia.needtomerge.R;
import com.tia.needtomerge.TicketClickListener;
import com.tia.needtomerge.model.TicketListModel;

import java.util.Objects;

public class AllAssetsList extends AppCompatActivity implements TicketClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_assets_list);
        initToolbar();
    }

    @Override
    public void cardClicked(TicketListModel f) {

    }
    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Tagging List");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);


    }
}