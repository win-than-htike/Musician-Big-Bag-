package com.onething.musicianbigbag.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.onething.musicianbigbag.R
import kotlinx.android.synthetic.main.activity_event_detail.*

class EventDetailActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) : Intent {
            return Intent(context, EventDetailActivity::class.java)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        iv_event_blur.setBlur(2)

    }
}
