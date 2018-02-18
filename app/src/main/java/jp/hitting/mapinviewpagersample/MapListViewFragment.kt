package jp.hitting.mapinviewpagersample

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.FrameLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_map_list_view.view.*

class MapListViewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_map_list_view, container, false)
        val listView = view.listView
        listView.adapter = MapListViewAdapter(this.context, this.childFragmentManager)
        return view
    }

    companion object {

        fun newInstance(): MapListViewFragment {
            val fragment = MapListViewFragment()
            return fragment
        }

    }
}

private class MapListViewAdapter(private val context: Context, private val fragmentManager: FragmentManager) : BaseAdapter() {

    private val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        if (position == 0) {
            val view = this.inflater.inflate(android.R.layout.simple_list_item_1, parent, false)
            view.findViewById<TextView>(android.R.id.text1).text = "Map Cell"
            return view
        }

        val mapView = MyMapView(this.context, this.fragmentManager)
        val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 500)
        mapView.layoutParams = layoutParams
        return mapView
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return 2
    }

}
