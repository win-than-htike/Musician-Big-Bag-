package com.onething.musicianbigbag.activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.delegate.OnItemClickListener
import com.onething.musicianbigbag.fragments.*
import com.onething.musicianbigbag.vos.BaseVO
import com.onething.musicianbigbag.vos.EventVO
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity(), OnItemClickListener<BaseVO> {

    override fun onClickItem(t: BaseVO) {
        if (t is EventVO) {
            startActivity(EventDetailActivity.newIntent(this@MainActivity))
        }
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_event -> {
                toolbar.setTitle(R.string.title_event)
                getFragment(EventFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_cartoon -> {
                toolbar.setTitle(R.string.title_cartoon)
                getFragment(CartoonFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_songs -> {
                toolbar.setTitle(R.string.title_songs)
                getFragment(SongsFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_writing -> {
                toolbar.setTitle(R.string.title_writing)
                getFragment(WritingFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_arts -> {
                toolbar.setTitle(R.string.title_art)
                getFragment(ArtsFragment.newInstance())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun getFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            toolbar.setTitleTextColor(ContextCompat.getColor(applicationContext, R.color.white_full))
            toolbar.setTitle(R.string.title_event)
            getFragment(EventFragment.newInstance())
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
