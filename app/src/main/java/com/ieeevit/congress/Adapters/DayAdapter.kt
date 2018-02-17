package com.ieeevit.congress.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ieeevit.congress.Model.Day
import com.ieeevit.congress.R

/**
 * Created by Yash on 18-02-2018.
 */
class DayAdapter(private val list:ArrayList<Day>,private val context:Context):RecyclerView.Adapter<DayAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder{
       val v = LayoutInflater.from(context).inflate(R.layout.day_row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindView(list[position])
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var day_event1 = itemView.findViewById<TextView>(R.id.eventText1)
        var day_event2 = itemView.findViewById<TextView>(R.id.eventText2)
        var day_event3 = itemView.findViewById<TextView>(R.id.eventText3)

        var day_speaker1 = itemView.findViewById<TextView>(R.id.speakerName1)
        var day_speaker2 = itemView.findViewById<TextView>(R.id.speakerName2)
        var day_speaker3 = itemView.findViewById<TextView>(R.id.speakerName3)

        var day_venue1 = itemView.findViewById<TextView>(R.id.venueText1)
        var day_venue2 = itemView.findViewById<TextView>(R.id.venueText2)
        var day_venue3 = itemView.findViewById<TextView>(R.id.venueText3)

        var day_time = itemView.findViewById<TextView>(R.id.timeText)

        fun bindView(day: Day){
            day_event1.text = day.event1
            day_event2.text = day.event2
            day_event3.text = day.event3

            day_speaker1.text = day.speaker1
            day_speaker2.text = day.speaker2
            day_speaker3.text = day.speaker3

            day_venue1.text = day.venue1
            day_venue2.text = day.venue2
            day_venue3.text = day.venue3

            day_time.text = day.event_time
        }
    }
}