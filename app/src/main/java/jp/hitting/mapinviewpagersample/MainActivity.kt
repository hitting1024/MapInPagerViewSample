package jp.hitting.mapinviewpagersample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
        this.addAction()
    }

    private fun addAction() {
        this.mapFragmentButton.setOnClickListener {
            this.startActivity(Intent(this, MapFragmentPagerActivity::class.java))
        }
        this.listViewButton.setOnClickListener {
            this.startActivity(Intent(this, ListViewPagerActivity::class.java))
        }
        this.fragmentButton.setOnClickListener {
            this.startActivity(Intent(this, FragmentPagerActivity::class.java))
        }
    }

}
