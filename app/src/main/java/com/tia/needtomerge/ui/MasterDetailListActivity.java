package com.tia.needtomerge.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.tia.needtomerge.MainActivity;
import com.tia.needtomerge.R;
import com.tia.needtomerge.databinding.ActivityMasterDetailListBinding;
import com.tia.needtomerge.databinding.ActivityMasterListBinding;

import java.util.Calendar;

public class MasterDetailListActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener , DatePickerDialog.OnDateSetListener {
    ActivityMasterDetailListBinding binding;
    Spinner spin;
    String[] country = { "2020", "2021", "2019", "2018", "2017"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil. setContentView(this,R.layout.activity_master_detail_list);
        getSupportActionBar().setTitle("Master Detail List");
        spin = findViewById(R.id.sp_assetsDetail);
        spin.setOnItemSelectedListener(this);
        setSpinnerAdapter();
    }
    private void setSpinnerAdapter(){
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),country[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),country[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
///later
    }

    public void FnDatePicker(View view) {

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

    }

//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        final Calendar c =Calendar.getInstance();
//        int y =c.get(Calendar.YEAR);
//        int m =c.get(Calendar.DAY_OF_MONTH);
//        int d =c.get(Calendar.DAY_OF_MONTH);
//        return new DatePickerDialog(this,this,y,m,d);
//    }
}