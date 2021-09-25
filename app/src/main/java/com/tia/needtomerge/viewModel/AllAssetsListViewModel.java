package com.tia.needtomerge.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tia.needtomerge.model.AllAssetsListModel;

import java.util.List;

public class AllAssetsListViewModel {
    public MutableLiveData<List<AllAssetsListModel>> listMutableLiveDataTagList = new MutableLiveData<>();
//    public TaggingListViewModel(@NonNull Application application) {
//        super(application);
//    }

}
