package jp.hitting.mapinviewpagersample

import android.content.Context
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.view_map.view.*

class MyMapView(context: Context, fragmentManager: FragmentManager) : FrameLayout(context) {

    init {
        val inflater = LayoutInflater.from(context)
        val layoutView = inflater.inflate(R.layout.view_map, null)
        val view = layoutView.mapFrameLayout

        val mapFragment = SupportMapFragment.newInstance()
        fragmentManager.beginTransaction().add(view.id, mapFragment).commit()
        mapFragment.getMapAsync {
            // nothing
        }

        this.addView(layoutView)
    }

}
