package com.example.secondbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver mBroadcastReceiver=new seconBroadcastReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter=new IntentFilter("com.example.broadcastapp.test");
        registerReceiver(mBroadcastReceiver,filter,"com.example.broadcastapp.PERMISSION",null);
    }
}
