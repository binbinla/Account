package com.example.administrator.account.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.administrator.account.R

/**
 * Created by Ding on 2017/9/26.
 */
abstract class BaseFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View  = inflater!!.inflate(getLayoutID(),container,false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        bindListener()
    }

    abstract fun getLayoutID():Int

    abstract fun initView()

    abstract fun bindListener()
}