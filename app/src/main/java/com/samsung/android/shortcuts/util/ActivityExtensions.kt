package com.samsung.android.shortcuts.util

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.util.Log
import android.widget.Toast

fun Activity.launchActivity(block: Intent.() -> Unit) {
    try {
        val intent = Intent().apply(block)
        startActivity(intent)
        finish()
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(this, "Failed to open activity", Toast.LENGTH_SHORT).show()
        Log.e("SamsungShortcuts", e.toString())
    }
}