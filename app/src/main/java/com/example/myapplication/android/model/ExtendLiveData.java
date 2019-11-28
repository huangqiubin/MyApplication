package com.example.myapplication.android.model;

import androidx.lifecycle.LiveData;

import com.example.myapplication.android.SimplePriceListener;
import com.example.myapplication.android.StockManager;

public class ExtendLiveData extends LiveData<String> {

    private StockManager stockManager = new StockManager();

    SimplePriceListener listener = new SimplePriceListener() {

        @Override
        public void onPriceChange(String name) {
            setValue(name);
        }
    };

    @Override
    protected void onActive() {
        super.onActive();
        stockManager.requestPriceUpdates(listener);
    }

    @Override
    protected void onInactive() {
        super.onInactive();

    }

}
