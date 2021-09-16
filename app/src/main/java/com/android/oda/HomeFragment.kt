package com.android.oda


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.banner_images_item.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var myFragment:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment

        myFragment = inflater.inflate(R.layout.fragment_home, container, false)
        return myFragment
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {//fragment에서는 이거 해줘야 위젯 뷰 띄울 수 있음
        super.onActivityCreated(savedInstanceState)
        home_banner_VP.adapter = HomeBannerPagerAdapter(getBannerImagesList())
        home_banner_VP.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        spring_dots_indicator.setViewPager2(home_banner_VP)
    }

    private fun getBannerImagesList(): ArrayList<Int> {
        return arrayListOf(R.drawable.s1, R.drawable.s2, R.drawable.s3)
    }


}
