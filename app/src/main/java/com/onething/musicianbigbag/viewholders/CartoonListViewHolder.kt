package com.onething.musicianbigbag.viewholders

import android.view.View
import com.onething.musicianbigbag.vos.CartoonVO
import kotlinx.android.synthetic.main.list_item_cartoon.view.*

class CartoonListViewHolder(itemView: View) : BaseViewHolder<CartoonVO>(itemView) {

    override fun bind(data: CartoonVO) {
        itemView.tv_cartoon_title.text = "Story ${data.title}"
    }

    override fun onClick(v: View?) {

    }

}