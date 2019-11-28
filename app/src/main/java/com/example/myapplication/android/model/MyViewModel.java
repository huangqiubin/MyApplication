package com.example.myapplication.android.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> currentName = new MutableLiveData<>();

    public MutableLiveData<String> getCurrentName() {
        return currentName;
    }
}
