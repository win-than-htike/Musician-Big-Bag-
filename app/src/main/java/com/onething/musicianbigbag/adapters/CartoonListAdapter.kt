package com.onething.musicianbigbag.adapters

import android.content.Context
import android.view.ViewGroup
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.viewholders.CartoonListViewHolder
import com.onething.musicianbigbag.vos.CartoonVO

class CartoonListAdapter(context: Context) : BaseRecyclerAdapter<CartoonListViewHolder, CartoonVO>(context) {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CartoonListViewHolder {
        val view = mLayoutInflater.inflate(R.layout.list_item_cartoon, p0, false)
        return CartoonListViewHolder(view)
    }

    override fun onBindViewHolder(p0: CartoonListViewHolder, p1: Int) {
        val cartoonVO = CartoonVO()
        val num = p1+1
        cartoonVO.title = num.toString()
        p0.bind(cartoonVO)
    }

    override fun getItemCount(): Int {
        return 20
    }

}