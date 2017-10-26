package com.example.administrator.account.fragment


import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.administrator.account.R
import com.example.administrator.account.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_account_detail.*
import java.time.Year
import java.util.*


class AccountDetailFragment : BaseFragment() {

    companion object {

        fun newInstance():AccountDetailFragment{
            val args = Bundle()
            val fragment = AccountDetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun getLayoutID(): Int = R.layout.fragment_account_detail

    override fun initView() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)+1
        val sb = StringBuffer("$year")
        sb.append(getString(R.string.year)).append("\n").append("$month").append(getString(R.string.month))
        val ss = SpannableString(sb.toString())
        ss.setSpan(ForegroundColorSpan(Color.parseColor("#000000")),"$year".length+1,sb.toString().length,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tv_data.setText(ss);

    }

    override fun bindListener() {
    }

}
