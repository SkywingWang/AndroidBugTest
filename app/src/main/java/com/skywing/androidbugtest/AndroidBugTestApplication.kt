package com.skywing.androidbugtest

import android.content.Context
import com.skywing.androidbugtest.base.BaseApplication
import kotlin.properties.Delegates

class AndroidBugTestApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        mContext = this

    }

    companion object{
        var instance : BaseApplication by Delegates.notNull()
            private set
        var mContext : Context?= null
        fun getContext(): Context {
            return mContext!!
        }
    }
}