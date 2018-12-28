package com.onething.musicianbigbag.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.adapters.EventListAdapter
import com.onething.musicianbigbag.delegate.OnItemClickListener
import com.onething.musicianbigbag.vos.EventVO
import kotlinx.android.synthetic.main.fragment_event.*
import kotlinx.android.synthetic.main.fragment_event.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class EventFragment : BaseFragment() {

    companion object {

        fun newInstance() : EventFragment {
            return EventFragment()
        }

    }

    private lateinit var mAdapter : EventListAdapter
    private lateinit var itemClickListener: OnItemClickListener<*>

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        itemClickListener = context as OnItemClickListener<*>
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_event, container, false)

        mAdapter = EventListAdapter(context!!, itemClickListener as OnItemClickListener<EventVO>)
        view.rv_events.setHasFixedSize(true)
        view.rv_events.layoutManager = LinearLayoutManager(context)
        view.rv_events.adapter = mAdapter

        return view
    }


}
