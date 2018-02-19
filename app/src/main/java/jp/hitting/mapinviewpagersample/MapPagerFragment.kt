package jp.hitting.mapinviewpagersample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.fragment_map_pager.view.*

class MapPagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_map_pager, container, false)
        val mapView = view.mapView
        val mapFragment = SupportMapFragment.newInstance()
        this.childFragmentManager.beginTransaction().add(mapView.id, mapFragment).commit()
        mapFragment.getMapAsync {
            // nothing
        }
        return view
    }

    companion object {

        fun newInstance(): MapPagerFragment {
            val fragment = MapPagerFragment()
            return fragment
        }

    }

}
