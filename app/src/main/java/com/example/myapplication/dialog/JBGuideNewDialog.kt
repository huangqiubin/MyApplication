package com.example.myapplication.dialog

import android.content.Context
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class JBGuideNewDialog(context: Context, var url: String) : MyBaseCenterDialog(context) {
    override fun setLayoutId(): Int {
        return R.layout.jb_dialog_guide
    }

    init {
        var wvContent: WebView = rootView.findViewById(R.id.wv_guide_content)
        rootView.findViewById<Button>(R.id.btn).setOnClickListener {
            dismiss()
        }

        wvContent.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        wvContent.loadUrl(url)
    }

}