package com.example.myapplication.dialog

import android.content.Context
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class JBGuideNewDialog(context: Context,var url: String) : BaseCenterDialog(context) {
    override fun getLayoutId(): Int = R.layout.jb_dialog_guide


    init {
        var ivGuideClose: ImageView? = rootView.findViewById(R.id.iv_guide_close)
        var tvOk: TextView? = rootView.findViewById(R.id.tv_jb_ok)
        var wvContent: WebView = rootView.findViewById(R.id.wv_guide_content)
        ivGuideClose?.setOnClickListener {
            dismiss()
        }
        tvOk?.setOnClickListener {
            dismiss()
        }
//        val settings = wvContent.settings
//        settings.builtInZoomControls = false
//        settings.javaScriptEnabled = true
//        settings.domStorageEnabled = true
//        settings.loadWithOverviewMode = true
//        settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.SINGLE_COLUMN
        wvContent.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        wvContent.loadUrl(url)

    }


}