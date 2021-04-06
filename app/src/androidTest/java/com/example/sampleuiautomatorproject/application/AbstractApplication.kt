package com.example.sampleuiautomatorproject.application

import android.content.Intent
import com.example.sampleuiautomatorproject.util.context
import com.example.sampleuiautomatorproject.util.device
import junit.framework.Assert.assertNotNull

abstract class AbstractApplication(val packageName: String) {


    fun assertInstalled() {
        assertNotNull(
            "App $packageName is not installed",
            context.packageManager.getLaunchIntentForPackage(packageName)
            )
    }

    open fun openApp() {
        val intent =
                context.packageManager.getLaunchIntentForPackage("ru.ozon.app.android")?.apply {
                    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                }
        device.pressHome()
        context.startActivity(intent)
    }
}
