package com.samsung.android.shortcuts.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.samsung.android.shortcuts.util.launchActivity

class AssistantActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launchActivity {
            action = Intent.ACTION_VOICE_COMMAND
        }
    }
}