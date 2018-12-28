package com.onething.musicianbigbag.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.adapters.SongListAdapter
import com.onething.musicianbigbag.viewholders.SongListViewHolder
import kotlinx.android.synthetic.main.fragment_songs.view.*

/**
 * A simple [Fragment] subclass.
 *
 */
class SongsFragment : BaseFragment() {

    companion object {

        fun newInstance() : SongsFragment {
            return SongsFragment()
        }

    }

    private lateinit var mAdapter: SongListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_songs, container, false)

        mAdapter = SongListAdapter(context!!)
        view.rv_songs.setHasFixedSize(true)
        view.rv_songs.layoutManager = GridLayoutManager(context, 2)
        view.rv_songs.adapter = mAdapter

        return view
    }


}
