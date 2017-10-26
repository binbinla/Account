package com.example.administrator.account.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity


/**
 * Created by Ding on 2017/9/21.
 *
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initData()
        bindListener()
    }

    abstract fun getLayoutId(): Int

    abstract fun initView()

    abstract fun initData()

    abstract fun bindListener()

    override fun onDestroy() {
        super.onDestroy()
    }

}
