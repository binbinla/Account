package com.example.administrator.account.activity

import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.example.administrator.account.R
import com.example.administrator.account.arouter.Path
import com.example.administrator.account.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun getLayoutId(): Int{
        return R.layout.activity_login
    }

    override fun initView() {

    }

    override fun initData() {

    }

    override fun bindListener() {
        tv_login.setOnClickListener({
            ARouter.getInstance().build(Path.main).navigation()
        })
    }

}
