package com.onething.musicianbigbag.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.adapters.CartoonListAdapter
import kotlinx.android.synthetic.main.fragment_cartoon.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class CartoonFragment : BaseFragment() {

    companion object {

        fun newInstance() : CartoonFragment {
            return CartoonFragment()
        }

    }

    private lateinit var mAdapter: CartoonListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cartoon, container, false)

        mAdapter = CartoonListAdapter(context!!)
        view.rv_cartoon.setHasFixedSize(true)
        view.rv_cartoon.layoutManager = LinearLayoutManager(context)
        view.rv_cartoon.adapter = mAdapter

        return view

    }


}
