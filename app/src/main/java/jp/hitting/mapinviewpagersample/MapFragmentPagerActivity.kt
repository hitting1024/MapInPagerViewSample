package jp.hitting.mapinviewpagersample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.activity_map_fragment_pager.*

class MapFragmentPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_map_fragment_pager)
        val viewPager = this.viewPager
        viewPager.adapter = MapFragmentPagerAdapter(this.supportFragmentManager)
    }

}

private class MapFragmentPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return SupportMapFragment.newInstance()
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Page $position"
    }

}
