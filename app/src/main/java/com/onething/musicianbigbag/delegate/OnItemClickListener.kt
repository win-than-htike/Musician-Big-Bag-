package com.onething.musicianbigbag.delegate

import com.onething.musicianbigbag.vos.EventVO

interface OnItemClickListener<T> {

    fun onClickItem(t : T)

}