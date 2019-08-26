package com.example.implicitcustombroadcastreceiverdemo

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val broadcastReceiver : BroadcastReceiverDemo = BroadcastReceiverDemo()

    // we want another app to send the broadcast and thus this app maybe in background
    //hence we need to register our broadcast receiver when we create our app and unregister it when our app is destroyed
    //thus we do it in onCreate and onDestroy respectively
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating broadcast receiver for our custom action
        val intentFilter : IntentFilter = IntentFilter("com.example.implicitcustombroadcastreceiverdemo.CUSTOM_ACTION")
        registerReceiver(broadcastReceiver,intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(broadcastReceiver)
    }
}
