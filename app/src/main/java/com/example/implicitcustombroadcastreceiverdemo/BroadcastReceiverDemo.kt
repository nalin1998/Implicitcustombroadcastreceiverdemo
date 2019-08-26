package com.example.implicitcustombroadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiverDemo : BroadcastReceiver() {

    override fun onReceive(context : Context?, intent : Intent?) {
        //com.example.implicitcustombroadcastreceiverdemo is our own custom action
        if(intent != null && "com.example.implicitcustombroadcastreceiverdemo.CUSTOM_ACTION".equals(intent.action)){
            var receivedAction : String? = intent.getStringExtra("com.example.implicitcustombroadcastreceiverdemo.SAMPLE_KEY")
            Toast.makeText(context , receivedAction , Toast.LENGTH_LONG).show()

        }
    }
}