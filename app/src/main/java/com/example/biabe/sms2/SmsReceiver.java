package com.example.biabe.sms2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.gesture.GestureOverlayView;

/**
 * Created by biabe on 10/20/2016.
 */

public class SmsReceiver extends BroadcastReceiver {
    public SmsReceiver()
    {

    }
    @Override
    public void onReceive(Context context, Intent intent)
    {
        System.out.println("received");
    }
}
