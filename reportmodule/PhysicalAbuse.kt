package com.example.reportmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.net.Uri.*
import android.view.View
import android.widget.VideoView
import android.widget.MediaController
import android.widget.Toast
import org.w3c.dom.Text
import android.content.Context
class PhysicalAbuse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physical_abuse)


        val videoView = findViewById<VideoView>(R.id.xml_video_view) as VideoView?
        val packageName = "android.resource://" + getPackageName() +"/" +R.raw.physicalabuse
        val uri = Uri.parse(packageName)
        videoView?.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView?.setMediaController(mediaController)

    }
}
