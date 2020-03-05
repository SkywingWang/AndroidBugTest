package com.skywing.androidbugtest.base

import android.content.Context
import androidx.multidex.MultiDexApplication
import kotlin.properties.Delegates

open class BaseApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object{
        var instance : BaseApplication by Delegates.notNull()
            private set

        @JvmStatic fun getContext(): Context {
            return instance
        }
    }
}