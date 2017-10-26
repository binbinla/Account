package com.example.administrator.account.base

import android.app.Application
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity


/**
 * Created by Administrator on 2017/9/21.
 */

abstract class BaseActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutId)

    }

    abstract val layoutId: Int

    override fun onDestroy() {
        super.onDestroy()
    }
}
