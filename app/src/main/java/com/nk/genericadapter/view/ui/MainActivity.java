package com.nk.genericadapter.view.ui;


import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.nk.genericadapter.R;
import com.nk.genericadapter.base.BaseActivity;
import com.nk.genericadapter.base.BaseAdapter;
import com.nk.genericadapter.constant.ConstantValues;
import com.nk.genericadapter.databinding.ActivityMainBinding;
import com.nk.genericadapter.model.AndroidVersion;
import com.nk.genericadapter.model.GoogleProduct;
import com.nk.genericadapter.viewmodel.MainViewModel;


import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends BaseActivity<MainViewModel,ActivityMainBinding> {

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public Class<MainViewModel> getViewModel() {
        return MainViewModel.class;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupGoogleProductRecyclerView();
        setupAndroidRecyclerView();

    }

    private void setupAndroidRecyclerView() {
        BaseAdapter<AndroidVersion> adapter = new BaseAdapter<>(R.layout.item_android_version);
        biding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        biding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        biding.recyclerView.setAdapter(adapter);
        adapter.setList(ConstantValues.getAndroidVersion());
        adapter.setActionListener((view,position) ->
                Toast.makeText(this
                        , adapter.getItemAtPosition(position).getName()
                        , Toast.LENGTH_SHORT).show());
    }
    private void setupGoogleProductRecyclerView() {
        BaseAdapter<GoogleProduct> adapter = new BaseAdapter<>(R.layout.item_google_product);
        biding.googleProductRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        biding.googleProductRecyclerView.setAdapter(adapter);
        adapter.setList(ConstantValues.getGoogleProducts());
    }

}