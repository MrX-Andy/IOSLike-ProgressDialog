package com.kazy91.ioslikeprogressdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;


public class IOS7LikeProgressDialog extends Dialog {
    private static final String TAG = IOS7LikeProgressDialog.class.getSimpleName();
    private TextView textView;

    public IOS7LikeProgressDialog(Context context) {
        super(context, R.style.Theme_CustomDialog);
        init(context);
    }

    public IOS7LikeProgressDialog(Context context, int theme) {
        super(context, theme);
        init(context);
    }

    public IOS7LikeProgressDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        init(context);
    }

    public void setText(String text){
        textView.setText(text);
    }

    public void setTextSize(float size){
        textView.setTextSize(size);

    }

    public void init(Context context){
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.ios7progress,null);
        textView = (TextView)layout.findViewById(R.id.textView);
        this.setCanceledOnTouchOutside(false);
        this.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
//        this.getWindow().setFlags(0, WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        this.setContentView(layout);
    }
}