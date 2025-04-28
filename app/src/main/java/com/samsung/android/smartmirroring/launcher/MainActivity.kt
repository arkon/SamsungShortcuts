package com.samsung.android.smartmirroring.launcher

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            Intent().apply {
                component = ComponentName(
                    "com.samsung.android.smartmirroring",
                    "com.samsung.android.smartmirroring.CastingActivity"
                )
                startActivity(this)
            }
        } catch (e: ActivityNotFoundException) {
            Log.e("SmartViewLauncher", e.toString())
        }
    }
}