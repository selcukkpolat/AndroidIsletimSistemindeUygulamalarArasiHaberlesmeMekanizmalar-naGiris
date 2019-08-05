package com.example.secondbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class seconBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("szss", "onReceive: yfctcctt");
        String message= intent.getStringExtra("Message");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }
}
