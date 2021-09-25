package com.tia.needtomerge.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tia.needtomerge.model.TicketListModel;

import java.util.List;

public class TicketViewModel extends ViewModel {
    private MutableLiveData<TicketListModel> ticketViewModelList =new  MutableLiveData<>();    //obj will get updated from application

    private LiveData<TicketListModel>  ticketListModelLiveData ;

    private void UpdateTicketDetail()
    {
        //hit api
    }
}
