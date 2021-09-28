package com.tia.needtomerge.viewModel;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

public class MasterDetailViewModel {
    public MutableLiveData<byte[]> imageOne = new MutableLiveData<>();
    public MutableLiveData<byte[]> imageTwo = new MutableLiveData<>();
    public MutableLiveData<byte[]> imageThree = new MutableLiveData<>();
    public MutableLiveData<byte[]> imageFour = new MutableLiveData<>();
    public MutableLiveData<byte[]> imageFive = new MutableLiveData<>();

    public MutableLiveData<String> AssetCode = new MutableLiveData<>();
    public MutableLiveData<String> AssetName = new MutableLiveData<>();
    public MutableLiveData<String> ImageCount = new MutableLiveData<>();
    public MutableLiveData<String> AssetType = new MutableLiveData<>();
    public MutableLiveData<String> AssetSurface = new MutableLiveData<>();
    public MutableLiveData<String> HeatedAsset = new MutableLiveData<>();
    public MutableLiveData<String> AssetCondition = new MutableLiveData<>();
    public MutableLiveData<String> AssetNameText = new MutableLiveData<>();
    public MutableLiveData<String> MakeTxt = new MutableLiveData<>();
    public MutableLiveData<String> ModelTxt = new MutableLiveData<>();
    public MutableLiveData<String> SerialNo = new MutableLiveData<>();
    public MutableLiveData<String> Location = new MutableLiveData<>();
    public MutableLiveData<String> SubLocation = new MutableLiveData<>();
    public MutableLiveData<String> SPOCName = new MutableLiveData<>();
    public MutableLiveData<String> PVName = new MutableLiveData<>();
    public MutableLiveData<String> ClientRemarks = new MutableLiveData<>();
    public MutableLiveData<Boolean> saveFlag = new MutableLiveData<>();
    public MutableLiveData<String> isRadioSelection = new MutableLiveData<>();
    public MutableLiveData<AllAssetsListViewModel> saveTaggingTable = new MutableLiveData<>();

    public void onClick(View view) {
//        Log.d("rawat", "onClick: Working");
        Toast.makeText(view.getContext(), "Onclick Working", Toast.LENGTH_SHORT).show();
    }

}
