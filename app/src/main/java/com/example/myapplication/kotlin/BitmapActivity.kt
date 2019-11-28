package com.example.myapplication.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_bitmap.*

class BitmapActivity : AppCompatActivity() {

    var onButtonSelect: OnButtonSelect? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitmap)
        onButtonSelect = object : OnButtonSelect{
            override fun onSelect() {
                text?.text = "Button 被选中啦！"
            }

        }
        btn?.setOnClickListener {
            onButtonSelect?.onSelect()
        }
    }


    interface OnButtonSelect {
        fun onSelect()
    }
}
