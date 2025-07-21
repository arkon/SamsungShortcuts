package com.samsung.android.shortcuts.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import com.samsung.android.shortcuts.util.launchActivity

class LinkTrampolineActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when (intent.action) {
            Intent.ACTION_SEND -> {
                launchActivity {
                    action = Intent.ACTION_VIEW
                    data = intent.getStringExtra(Intent.EXTRA_TEXT)?.toUri()
                }
            }
            else -> {
                Log.e("LinkTrampolineActivity", "Unknown action: ${intent.action}")
            }
        }

        finish()
    }
}