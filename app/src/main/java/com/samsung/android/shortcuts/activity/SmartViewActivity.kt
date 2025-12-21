package com.samsung.android.shortcuts.activity

import android.app.Activity
import android.content.ComponentName
import android.os.Bundle
import com.samsung.android.shortcuts.util.launchActivity

private const val PACKAGE_NAME = "com.samsung.android.smartmirroring"

class SmartViewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launchActivity {
            component = ComponentName(
                PACKAGE_NAME,
                "$PACKAGE_NAME.CastingActivity"
            )
        }
    }
}