package com.example.myapplication.dialog;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.example.myapplication.R;

public abstract class MyBaseCenterDialog extends AlertDialog {
    View rootView;
    Context context;

    protected MyBaseCenterDialog(@NonNull Context context) {
        this(context, R.style.dialog_common_theme);
    }

    public MyBaseCenterDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        Window window = getWindow();
        window.setGravity(Gravity.CENTER);
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.height = (int)(getScreenHeight() * 0.65f);
        window.setAttributes(layoutParams);
        rootView = LayoutInflater.from(context).inflate(setLayoutId(), null);
        setView(rootView);

    }

    abstract protected int setLayoutId();

    public int getScreenWidth() {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (wm == null) return -1;
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            wm.getDefaultDisplay().getRealSize(point);
        } else {
            wm.getDefaultDisplay().getSize(point);
        }
        return point.x;
    }

    public int getScreenHeight() {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (wm == null) return -1;
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            wm.getDefaultDisplay().getRealSize(point);
        } else {
            wm.getDefaultDisplay().getSize(point);
        }
        return point.y;
    }



}
