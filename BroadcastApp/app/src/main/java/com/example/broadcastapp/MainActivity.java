package com.example.broadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.nio.file.attribute.AclEntry;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    Handler h = new Handler();
    final String perm="com.example.broadcastapp.PERMISSION";

    Runnable r = new Runnable() {
        @Override
        public void run() {

            Log.e("Test", "run: Sending broadcast...");
            Intent mIntent=new Intent(getPackageName() + ".test");
            mIntent.putExtra("Message","Go Home");
            sendBroadcast(mIntent,perm);
            h.postDelayed(this,5000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("logg", "onClick: "+getPackageName() );

            }
        });


       h.postDelayed(r,5000L);
    }
}
