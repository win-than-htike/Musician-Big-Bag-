package com.onething.musicianbigbag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.onething.musicianbigbag.viewholders.BaseViewHolder
import java.util.ArrayList

abstract class BaseRecyclerAdapter<T : BaseViewHolder<*>, W>(context: Context) : RecyclerView.Adapter<T>() {

    protected var mLayoutInflater: LayoutInflater

    protected var mData: MutableList<W>? = null

    val items: List<W>
        get() = if (mData == null) ArrayList() else mData!!

    init {
        mLayoutInflater = LayoutInflater.from(context)
        mData = ArrayList()
    }

    override fun getItemCount(): Int {
        return mData!!.size
    }

    fun setNewData(newData: MutableList<W>) {
        mData = newData
        notifyDataSetChanged()
    }

    fun appendNewData(newData: List<W>) {
        mData!!.addAll(newData)
        notifyDataSetChanged()
    }

    fun getItemAt(position: Int): W? {
        return if (position < mData!!.size) mData!![position] else null

    }

    fun removeData(data: W) {
        mData!!.remove(data)
        notifyDataSetChanged()
    }

    fun addNewData(data: W) {
        mData!!.add(data)
        notifyDataSetChanged()
    }

    fun addDataAtPositionZero(data: W) {
        mData!!.add(0, data)
        notifyDataSetChanged()
    }

    fun clearData() {
        mData = ArrayList()
        notifyDataSetChanged()
    }
}