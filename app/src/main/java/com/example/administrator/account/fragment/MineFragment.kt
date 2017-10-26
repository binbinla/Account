package com.example.administrator.account.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.administrator.account.R
import com.example.administrator.account.base.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class MineFragment : BaseFragment() {



    companion object {

        fun newInstance():MineFragment{
            val args = Bundle()
            val fragment = MineFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun getLayoutID(): Int =R.layout.fragment_mine

    override fun initView() {

    }

    override fun bindListener() {

    }


}
