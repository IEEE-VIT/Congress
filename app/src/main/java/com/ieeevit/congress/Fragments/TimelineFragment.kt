package com.ieeevit.congress.Fragments

import android.content.Context
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ieeevit.congress.R
import android.support.v7.app.AppCompatActivity
import com.ieeevit.congress.Adapters.TimelinePageAdapter
import com.ieeevit.congress.TimelineTabs.day1
import com.ieeevit.congress.TimelineTabs.day2
import com.ieeevit.congress.TimelineTabs.day3
import com.ieeevit.congress.TimelineTabs.day4
import kotlinx.android.synthetic.main.appbar_timeline.view.*


/**
 * Created by Yash on 16-02-2018.
 */
class TimelineFragment:Fragment(){

    var pageAdapter:TimelinePageAdapter? = null
    var u:ViewPager? = null
    var t:TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //(toolbar_main as AppCompatActivity).supportActionBar!!

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v =  inflater!!.inflate(R.layout.timeline_layout,container,false)


        (activity as AppCompatActivity).setSupportActionBar(v.toolbar_main)
        pageAdapter = TimelinePageAdapter(activity.supportFragmentManager)
        pageAdapter!!.addFragments(day1(),"Day 1")
        pageAdapter!!.addFragments(day2(),"Day 2")
        pageAdapter!!.addFragments(day3(),"Day 3")
        pageAdapter!!.addFragments(day4(),"Day 4")



        u=v.findViewById(R.id.TimelineViewPager) as ViewPager
        t=v.findViewById(R.id.TimelineTabLayout) as TabLayout

        u!!.adapter = pageAdapter

        t!!.setupWithViewPager(u)


        return v
}

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onInflate(context: Context?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

}
/*<include layout="@layout/appbar_timeline"
android:id="@+id/toolbar_main_1" />*/
//android:layout_below="@+id/toolbar_main_1"