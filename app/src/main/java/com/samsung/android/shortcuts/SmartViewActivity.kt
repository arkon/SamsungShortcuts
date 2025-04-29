package com.samsung.android.shortcuts

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SmartViewActivity : Activity() {
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
            Toast.makeText(this, "Failed to open Smart View", Toast.LENGTH_SHORT).show()
            Log.e("SmartViewActivity", e.toString())
        }
    }
}