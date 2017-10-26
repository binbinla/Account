package com.example.administrator.account

import android.app.Application
import android.os.Build
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Created by Ding on 2017/9/22.
 */
class AccountApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}