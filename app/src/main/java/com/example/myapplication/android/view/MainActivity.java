package com.example.myapplication.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.android.model.ExtendLiveData;
import com.example.myapplication.android.model.MyViewModel;

public class MainActivity extends AppCompatActivity {

    private MyViewModel model;
    private Button button;
    private ExtendLiveData extendLiveData;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl("https://www.jianshu.com/p/3c94ae673e2a");
                return true;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https://www.jianshu.com/p/3c94ae673e2a");

            }
        });



//        final Observer<String> nameObserver = new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                textView.setText(s);
//            }
//        };
//
//        model.getCurrentName().observe(this,nameObserver);


    }


}
