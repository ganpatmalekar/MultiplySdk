package com.gsm.multiplylib

import android.content.Context
import android.content.Intent

object MultiplyUtility {
    fun getMultiplicationIntent(context: Context): Intent {
        return Intent(context, MultiplyActivity::class.java)
    }
}