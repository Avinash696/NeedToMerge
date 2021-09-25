package com.tia.needtomerge.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.tia.needtomerge.AllAssetsClickListener;
import com.tia.needtomerge.R;
import com.tia.needtomerge.databinding.AdapterAllassetsListBinding;
import com.tia.needtomerge.model.AllAssetsListModel;
import com.tia.needtomerge.ui.AllAssetsDetail;
import com.tia.needtomerge.ui.AllAssetsList;
import com.tia.needtomerge.ui.MasterListActivity;
import com.tia.needtomerge.ui.TicketDetailActivity;
import com.tia.needtomerge.ui.TicketListActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AllAssetsListAdapter extends RecyclerView.Adapter<AllAssetsListAdapter.ViewHolder> implements  Filterable {

    private List<AllAssetsListModel> dataModelList;
    private List<AllAssetsListModel> listFiltered;
    private Context context;
    private AllAssetsClickListener listener;



    public AllAssetsListAdapter(List<AllAssetsListModel> dataModelList, Context ctx, AllAssetsClickListener listener) {
        this.dataModelList = dataModelList;
        this.listFiltered = dataModelList;
        this.listener = listener;
        context = ctx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        AdapterAllassetsListBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.adapter_allassets_list, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
//        AllAssetsListModel item = listFiltered.get(i);
//        AdapterAllassetsListBinding model = new TaggingItemViewModel();
//        model.setValue(item);
//        viewHolder.binding.setViewModel(model);
//        if(item.TagDStatus.equalsIgnoreCase("completed") || item.SaveFlag) {
//            viewHolder.binding.checkFlag.setVisibility(View.VISIBLE);
//        }else {
//            viewHolder.binding.checkFlag.setVisibility(View.GONE);
//        }
//        viewHolder.binding.setItemClickListener(listener);
        AllAssetsListModel datalist = dataModelList.get(i);
        viewHolder.binding.tvAndroidCode.setText(datalist.tagCode);
        viewHolder.binding.tvAndroidName.setText(datalist.tagName);
        viewHolder.binding.tvAndroidCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AllAssetsDetail.class);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        if (listFiltered == null)
            return 0;

        return listFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                List<AllAssetsListModel> filteredList = filterList(charString);
                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                notifyDataSetChanged();
                listFiltered = (ArrayList<AllAssetsListModel>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    private List<AllAssetsListModel> filterList(String keyword) {
        if (listFiltered != null && dataModelList != null) {
            List<AllAssetsListModel> filteredList = new ArrayList<>();
            keyword = keyword.toLowerCase(Locale.getDefault());

            if (TextUtils.isEmpty(keyword)) {
                filteredList = dataModelList;
            } else {

                for (AllAssetsListModel item : dataModelList) {
                    if (!TextUtils.isEmpty(item.tagName)) {
                        if (item.tagCode.toLowerCase(Locale.getDefault()).contains(keyword) || item.tagName.toLowerCase(Locale.getDefault()).contains(keyword)) {
                            filteredList.add(item);
                        }
                    }



                }
            }
            return filteredList;
        }
        return null;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        AdapterAllassetsListBinding binding;

        ViewHolder(AdapterAllassetsListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}