package com.tia.needtomerge.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tia.needtomerge.model.AllAssetsListModel;

import java.util.List;

public class AllAssetsListViewModel extends ViewModel {
    public MutableLiveData<List<AllAssetsListModel>> listMutableLiveDataTagList = new MutableLiveData<>();
//    public TaggingListViewModel(@NonNull Application application) {
//        super(application);
//    }
public MutableLiveData<String> AssetCode = new MutableLiveData<>();
    public MutableLiveData<String> AssetName = new MutableLiveData<>();

}
