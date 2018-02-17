package com.ieeevit.congress.TimelineTabs


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.ieeevit.congress.Adapters.DayAdapter
import com.ieeevit.congress.Model.Day

import com.ieeevit.congress.R
import kotlinx.android.synthetic.main.fragment_day1.*
import java.util.ArrayList


/**
 * A simple [Fragment] subclass.
 */
class day1 : Fragment() {

    var volleyRequest: RequestQueue? = null
    var Daylist:ArrayList<Day>? = null
    var dayAdapter1:DayAdapter? = null
    var layoutManger:RecyclerView.LayoutManager? = null
    var r:RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v =  inflater!!.inflate(R.layout.fragment_day1, container, false)

        Daylist = ArrayList<Day>()
        volleyRequest = Volley.newRequestQueue(activity)

        var day = Day()

        day.event1 = "AI"
        day.event2 = "Block Chain"
        day.event3 = "Crypto Currency"
        day.venue1 = "SJT 614"
        day.venue2 = "SJT 714"
        day.venue3 = "SJT 814"
        day.speaker1 = "Bharath"
        day.speaker2 = "Yash"
        day.speaker3 = "Saransh"
        day.event_time = "3:00 PM"

        r = v.findViewById(R.id.recycler_day1) as RecyclerView

        Daylist!!.add(day)
        dayAdapter1 = DayAdapter(Daylist!!,activity)
        layoutManger = LinearLayoutManager(activity)
        r!!.layoutManager = layoutManger
        r!!.adapter = dayAdapter1

       // r.notifyDataSetChanged()


    return v
    }

    fun getDay(){



    }

}// Required empty public constructor
