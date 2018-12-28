package com.onething.musicianbigbag.adapters

import android.content.Context
import android.view.ViewGroup
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.viewholders.BookListViewHolder
import com.onething.musicianbigbag.vos.BookVO

class BookListAdapter(context: Context) : BaseRecyclerAdapter<BookListViewHolder, BookVO>(context) {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): BookListViewHolder {
        val view = mLayoutInflater.inflate(R.layout.list_item_writing, p0, false)
        return BookListViewHolder(view)
    }

    override fun onBindViewHolder(p0: BookListViewHolder, p1: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }

}