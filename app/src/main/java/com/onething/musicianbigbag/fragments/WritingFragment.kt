package com.onething.musicianbigbag.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.adapters.BookListAdapter
import kotlinx.android.synthetic.main.fragment_writing.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class WritingFragment : BaseFragment() {

    companion object {

        fun newInstance(): WritingFragment {
            return WritingFragment()
        }

    }

    private lateinit var mAdapter: BookListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_writing, container, false)

        mAdapter = BookListAdapter(context!!)
        view.rv_writing.setHasFixedSize(true)
        view.rv_writing.layoutManager = GridLayoutManager(context, 2)
        view.rv_writing.adapter = mAdapter

        return view

    }


}
