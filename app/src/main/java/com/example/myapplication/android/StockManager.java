package com.example.myapplication.android;

public class StockManager {
    public void requestPriceUpdates(SimplePriceListener listener){
        listener.onPriceChange("nihao");
    }
}
