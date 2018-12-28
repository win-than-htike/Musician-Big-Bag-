package com.onething.musicianbigbag.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.onething.musicianbigbag.R
import kotlinx.android.synthetic.main.activity_event_detail.*

class EventDetailActivity : BaseActivity() {

    override fun getDisplayHomeBack(): Boolean {
        return true
    }

    override fun getResourceView(): Int {
        return R.layout.activity_event_detail
    }

    companion object {

        fun newIntent(context: Context) : Intent {
            return Intent(context, EventDetailActivity::class.java)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        iv_event_blur.setBlur(2)

    }
}
