package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.factory;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view_model.SignupViewModel;

public class MyViewModelFactory implements ViewModelProvider.Factory {
    private Application mApplication;
    private String id,key,secret;


    public MyViewModelFactory(Application application, String id, String key, String secret) {
        mApplication = application;
        this.id = id;
        this.key = key;
        this.secret = secret;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new SignupViewModel(mApplication, id,key,secret);
    }
}