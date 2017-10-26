package com.example.administrator.account.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.administrator.account.R


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_blank, container, false)
    }

    companion object {

        fun newInstance(): BlankFragment {
            val args = Bundle()
            val fragment = BlankFragment()
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
