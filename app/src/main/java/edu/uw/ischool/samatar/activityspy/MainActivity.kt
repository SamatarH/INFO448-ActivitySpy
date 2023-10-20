package edu.uw.ischool.samatar.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("App destroyer","on Destroy event fired")
        Log.e("App destroyer","We're going down, Captain!")
    }
    override fun onStart() {
        super.onStart()
        Log.i("App Start","on Start event fired")
    }
    override fun onStop() {
        super.onStop()
        Log.i("App Stop","on Stop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("App Pause","on Pause event fired")
    }
    override fun onResume() {
        super.onResume()
        Log.i("App Resume", "on Resume event fired")
    }
}
