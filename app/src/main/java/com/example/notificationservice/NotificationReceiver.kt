package com.example.notificationservice

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast
import androidx.core.app.NotificationManagerCompat

class NotificationReceiver : Service() {
    var mediaPlayer: MediaPlayer? = null

    override fun onCreate() {
        super.onCreate()
        //R dan kiyin R.row.musiqani nomini yozasan
        /*mediaPlayer = MediaPlayer.create(this,R)*/
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (mediaPlayer!!.isPlaying){
            mediaPlayer!!.pause()
        }else{
            mediaPlayer!!.start()
        }

        return super.onStartCommand(intent, flags, startId)
       
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}