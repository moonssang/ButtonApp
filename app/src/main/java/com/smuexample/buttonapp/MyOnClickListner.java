package com.smuexample.buttonapp;

import android.view.View;

public class MyOnClickListner implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListner(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.mtextView1.setText("You clicked 문현화의 button");
    }
}
