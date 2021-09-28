package com.tia.needtomerge.ui;

import static com.tia.needtomerge.constant.constants.ASSET_CODE;
import static com.tia.needtomerge.constant.constants.ASSET_NAME;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.tia.needtomerge.R;
import com.tia.needtomerge.databinding.ActivityAllAssetsDetailBinding;
import com.tia.needtomerge.viewModel.AllAssetsListViewModel;

public class AllAssetsDetail extends AppCompatActivity {
    AllAssetsListViewModel viewModel;
    ActivityAllAssetsDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("All Assets Detail");
       binding= DataBindingUtil. setContentView(this,R.layout.activity_all_assets_detail);

        viewModel = new ViewModelProvider(this).get(AllAssetsListViewModel.class);
        binding.setLifecycleOwner(this);
        getIntentData();
    }
    void getIntentData(){
        Bundle bundle= getIntent().getExtras();
        if(bundle != null){
            viewModel.AssetCode.setValue(bundle.getString(ASSET_CODE));
            viewModel.AssetName.setValue(bundle.getString(ASSET_NAME));

            //temp data set
            binding.etName.setText(bundle.getString(ASSET_NAME));
            binding.etCode.setText(bundle.getString(ASSET_CODE));
        }
    }
}