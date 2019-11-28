package com.example.myapplication.android.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class CallbackActivity extends AppCompatActivity {

    MyCallBack callBack;
    String mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback);
        Button button = findViewById(R.id.btn);
        callBack = new MyCallBack() {
            @Override
            public void setMessage(String message) {
                mMessage = message;
                button.setText(message);
            }
        };
    }

    public void huang(View view){
        View dialogView = LayoutInflater.from(CallbackActivity.this).inflate(R.layout.dialog_associate_master,null,false);
        EditText editText = dialogView.findViewById(R.id.name);
        Button button = dialogView.findViewById(R.id.btn);
        AlertDialog.Builder builder = new AlertDialog.Builder(CallbackActivity.this)
                .setView(dialogView);
        AlertDialog dialog = builder.create();
        dialog.show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                if (!message.equals("")){
                    callBack.setMessage(message);
                }

                dialog.dismiss();
            }
        });
    }

    interface MyCallBack{
        void setMessage(String message);
    }
}
