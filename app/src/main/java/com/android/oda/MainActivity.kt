package com.android.oda

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var context : Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val adapter = PagerAdapter(supportFragmentManager)
        adapter.addFragement(HomeFragment(), "홈")
        adapter.addFragement(BrandFragment(), "브랜드")
        adapter.addFragement(BestFragment(), "베스트")

        main_VP.adapter = adapter
        main_TL.setupWithViewPager(main_VP)



        search_ET.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, SearchActivity::class.java))
        })


    }

}
