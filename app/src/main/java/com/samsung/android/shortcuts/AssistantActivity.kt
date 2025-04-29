package com.samsung.android.shortcuts

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class AssistantActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            Intent().apply {
                action = Intent.ACTION_VOICE_COMMAND
                startActivity(this)
            }
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "Failed to open assistant", Toast.LENGTH_SHORT).show()
            Log.e("AssistantActivity", e.toString())
        }
    }
}