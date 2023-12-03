package senit.demo.music_contact_0835627335

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.mrsiro)
    }

    override fun onResume() {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
        super.onResume()
    }

    override fun onDestroy() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
        super.onDestroy()
    }

}