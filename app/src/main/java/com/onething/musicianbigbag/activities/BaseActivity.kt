package com.onething.musicianbigbag.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResourceView())

        supportActionBar!!.setDisplayHomeAsUpEnabled(getDisplayHomeBack())

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item!!.itemId == android.R.id.home) {
            onBackPressed()
        }
        return true
    }
    
    abstract fun getDisplayHomeBack(): Boolean

    abstract fun getResourceView(): Int

}
