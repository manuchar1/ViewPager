package com.example.viewpager

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class PagerAdapter(private val mContext: Context) : PagerAdapter() {


    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val customPagerEnum = PagerEnum.values()[position]
        val inflater = LayoutInflater.from(mContext)
        val layout = inflater.inflate(customPagerEnum.layoutResId, collection, false) as ViewGroup
        collection.addView(layout)



        layout.setOnClickListener {


           // findNavController(Fragment(R.layout.fragment_gallery)).navigate(R.id.action_galleryFragment_to_detailsFragment)
            /*FragmentManager.findFragment<>()*/

            Log.i("TAG", "This page was clicked")




        }


        return layout


    }



    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun getCount(): Int {
        return PagerEnum.values().size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val customPagerEnum = PagerEnum.values()[position]
        return mContext.getString(customPagerEnum.titleResId)
    }

}