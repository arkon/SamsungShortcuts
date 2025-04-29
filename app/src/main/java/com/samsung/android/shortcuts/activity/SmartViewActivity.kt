package com.samsung.android.shortcuts.activity

import android.app.Activity
import android.content.ComponentName
import android.os.Bundle
import com.samsung.android.shortcuts.util.launchActivity

class SmartViewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launchActivity {
            component = ComponentName(
                "com.samsung.android.smartmirroring",
                "com.samsung.android.smartmirroring.CastingActivity"
            )
        }
    }
}