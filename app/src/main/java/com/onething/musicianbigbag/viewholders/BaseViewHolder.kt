package com.onething.musicianbigbag.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    protected var mDetachedWindow: Boolean = false

    init {
        itemView.setOnClickListener(this)

        itemView.addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View) {
                mDetachedWindow = false
            }

            override fun onViewDetachedFromWindow(v: View) {
                mDetachedWindow = true
            }
        })
    }

    abstract fun bind(data: T)
}
