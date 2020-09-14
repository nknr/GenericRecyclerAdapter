package com.nk.genericadapter.base;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


public abstract class BaseActivity<V extends ViewModel, D extends ViewDataBinding> extends AppCompatActivity {

    protected V viewModel;
    protected D biding;

    @LayoutRes
    public abstract int getLayout();

    public abstract Class<V> getViewModel();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        biding = DataBindingUtil.setContentView(this,getLayout());
        viewModel = new ViewModelProvider(this).get(getViewModel());
    }
}
