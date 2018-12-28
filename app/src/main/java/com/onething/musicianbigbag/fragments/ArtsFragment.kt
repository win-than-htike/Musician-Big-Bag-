package com.onething.musicianbigbag.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onething.musicianbigbag.R

/**
 * A simple [Fragment] subclass.
 *
 */
class ArtsFragment : BaseFragment() {

    companion object {

        fun newInstance() : ArtsFragment {
            return ArtsFragment()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arts, container, false)
    }


}
