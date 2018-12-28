package com.onething.musicianbigbag.adapters

import android.content.Context
import android.view.ViewGroup
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.delegate.OnItemClickListener
import com.onething.musicianbigbag.viewholders.EventListViewHolder
import com.onething.musicianbigbag.vos.EventVO

class EventListAdapter(context: Context, itemClickListener: OnItemClickListener<EventVO>) : BaseRecyclerAdapter<EventListViewHolder, EventVO>(context) {

    private val itemClickListener = itemClickListener

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EventListViewHolder {
        val view = mLayoutInflater.inflate(R.layout.list_item_event, p0, false)
        return EventListViewHolder(view, itemClickListener = itemClickListener)
    }

    override fun onBindViewHolder(p0: EventListViewHolder, p1: Int) {
        p0.bind(EventVO())
    }

    override fun getItemCount(): Int {
        return 10
    }

}