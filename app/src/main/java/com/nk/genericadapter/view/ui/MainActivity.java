package com.nk.genericadapter.view.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.nk.genericadapter.R;
import com.nk.genericadapter.base.BaseActivity;
import com.nk.genericadapter.base.BaseAdapter;
import com.nk.genericadapter.databinding.ActivityMainBinding;
import com.nk.genericadapter.model.AndroidVersion;
import com.nk.genericadapter.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

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
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        BaseAdapter<AndroidVersion> adapter = new BaseAdapter<>(R.layout.item_android_version);
        binding.patientRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.patientRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        binding.patientRecyclerView.setAdapter(adapter);
        adapter.setList(getList());
        adapter.setActionListener(position ->
                Toast.makeText(this
                        , ((AndroidVersion) adapter.getItemAtPosition(position)).getName()
                        , Toast.LENGTH_SHORT).show());
    }


    public List<AndroidVersion> getList() {
        List<AndroidVersion> list = new ArrayList<>();
        list.add(new AndroidVersion("A"));
        list.add(new AndroidVersion("B"));
        list.add(new AndroidVersion("C"));
        return list;
    }

}