package com.example.administrator.account.activity

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.administrator.account.R
import com.example.administrator.account.base.BaseActivity2

class TestActivity : BaseActivity2() {
    override val layoutId: Int
        get() = R.layout.activity_test


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

    }
}
