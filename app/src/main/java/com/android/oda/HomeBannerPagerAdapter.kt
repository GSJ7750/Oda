package com.android.oda

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.banner_images_item.view.*

class HomeBannerPagerAdapter(BannerImageList : ArrayList<Int>) : RecyclerView.Adapter<HomeBannerPagerAdapter.PagerViewHolder>() {

    var item = BannerImageList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PagerViewHolder((parent))

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.img.setImageResource(item[position])
    }


    inner class PagerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.banner_images_item, parent, false)){
        val img = itemView.home_banner_ImgV!!
    }


}