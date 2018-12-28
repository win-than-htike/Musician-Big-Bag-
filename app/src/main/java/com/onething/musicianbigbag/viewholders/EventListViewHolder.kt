package com.onething.musicianbigbag.viewholders

import android.view.View
import com.onething.musicianbigbag.delegate.OnItemClickListener
import com.onething.musicianbigbag.vos.EventVO
import kotlinx.android.synthetic.main.activity_event_detail.view.*

class EventListViewHolder(itemView: View, private val itemClickListener: OnItemClickListener<EventVO>) : BaseViewHolder<EventVO>(itemView) {

    private lateinit var data : EventVO

    override fun bind(data: EventVO) {
        this.data = data
    }

    override fun onClick(v: View?) {
        itemClickListener.onClickItem(data)
    }

}