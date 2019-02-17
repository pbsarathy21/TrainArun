package com.example.trainarun;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class MainVM extends ViewModel {

    public ObservableField<String> name = new ObservableField<>();

    public MutableLiveData<String> data = new MutableLiveData<>();

    public MainVM() {

        name.set("Hello Arun Prasad");
    }

    public MutableLiveData<String> getData() {
        return data;
    }
}
