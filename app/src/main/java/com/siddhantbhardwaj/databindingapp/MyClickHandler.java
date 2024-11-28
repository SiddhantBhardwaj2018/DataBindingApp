package com.siddhantbhardwaj.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {

    Context context;
    public MyClickHandler(Context context) {
        this.context = context;
    }

    public void onBtnClick(View view){
        Toast.makeText(
                context,
                "First Button is clicked",
                Toast.LENGTH_LONG
        ).show();
    }

}
