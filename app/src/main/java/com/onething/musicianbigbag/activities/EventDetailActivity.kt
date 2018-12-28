package com.onething.musicianbigbag.activities

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.onething.musicianbigbag.R
import com.onething.musicianbigbag.adapters.EventListAdapter
import kotlinx.android.synthetic.main.activity_event_detail.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.LatLng



class EventDetailActivity : BaseActivity(), OnMapReadyCallback {

    override fun onMapReady(gMap: GoogleMap?) {

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(16.8661,96.1951)
        val marker = gMap?.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Yangon")
                .zIndex(0.1f)
                .alpha(0.7f)
        )
        marker?.showInfoWindow()

        gMap?.uiSettings!!.isMapToolbarEnabled = true
        gMap.uiSettings.isZoomControlsEnabled = true

        // Move the camera instantly to location with a zoom of 15.
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15f))

        // Zoom in, animating the camera.
        gMap.animateCamera(CameraUpdateFactory.zoomTo(18f), 2000, null)

    }

    private lateinit var mapFrag : SupportMapFragment

    override fun getDisplayHomeBack(): Boolean {
        return true
    }

    override fun getResourceView(): Int {
        return R.layout.activity_event_detail
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_share,menu)
        return true

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

        mapFrag = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFrag.getMapAsync(this)

    }
}
