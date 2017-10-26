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
class DiscoverFragment : Fragment() {

    companion object {

        fun newInstance():DiscoverFragment{
            val args = Bundle()
            val fragment = DiscoverFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_discover, container, false)
    }

}// Required empty public constructor
