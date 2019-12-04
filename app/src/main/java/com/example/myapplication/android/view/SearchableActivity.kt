package com.example.myapplication.android.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.dialog.JBGuideNewDialog

class SearchableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchable)

    }

    fun huang(v: View) {
        var jbGuideNewDialog: JBGuideNewDialog = JBGuideNewDialog(this, "https://www.baidu.com/")
        jbGuideNewDialog.show()
    }
}


