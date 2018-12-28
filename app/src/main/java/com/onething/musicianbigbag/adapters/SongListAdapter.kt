package com.onething.musicianbigbag.adapters

import android.content.Context
import android.view.ViewGroup
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.viewholders.SongListViewHolder
import com.onething.musicianbigbag.vos.SongVO

class SongListAdapter(context: Context) : BaseRecyclerAdapter<SongListViewHolder, SongVO>(context) {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SongListViewHolder {
        val view = mLayoutInflater.inflate(R.layout.list_item_albums, p0, false)
        return SongListViewHolder(view)
    }

    override fun onBindViewHolder(p0: SongListViewHolder, p1: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }

}