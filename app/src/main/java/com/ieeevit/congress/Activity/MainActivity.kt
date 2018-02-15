package com.ieeevit.congress.Activity

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.ieeevit.congress.Fragments.ChatFragment
import com.ieeevit.congress.Fragments.NotificationFragment
import com.ieeevit.congress.Fragments.ProfileFragment
import com.ieeevit.congress.Fragments.TimelineFragment
import com.ieeevit.congress.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    var isProfileFragmentLoaded = true
    var isChatFragmentLoaded = true
    var isNotificationFragmentLoaded = true
    var isTimelineFragmentLoaded = true




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//BOTTOM NAVIGATION--------------------------------------------------

        val timelineTab = AHBottomNavigationItem("Itenary",R.drawable.abc_ic_star_black_16dp)
        val notificationTab = AHBottomNavigationItem("Notifications",R.drawable.abc_ic_star_black_16dp)
        val chatTab = AHBottomNavigationItem("Chat",R.drawable.abc_ic_star_black_16dp)
        val profileTab = AHBottomNavigationItem("Profile",R.drawable.abc_ic_star_black_16dp)

        bottom_navigation.addItem(timelineTab)
        bottom_navigation.addItem(notificationTab)
        bottom_navigation.addItem(chatTab)
        bottom_navigation.addItem(profileTab)

        bottom_navigation.isBehaviorTranslationEnabled = false
        bottom_navigation.isTranslucentNavigationEnabled = true
        //Titles
        bottom_navigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE);
        bottom_navigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottom_navigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);

        bottom_navigation.isColored = true
        bottom_navigation.setCurrentItem(1)
        bottom_navigation.setNotificationBackgroundColor(Color.parseColor("#F63D2B"))

        bottom_navigation.enableItemAtPosition(2)

        bottom_navigation.setItemDisableColor(Color.parseColor("#3A000000"))

   //bottom_navigation.setOnTabSelectedListener{ position, wasSelected ->true}



    }



    fun showProfileFragment(){
        val transaction = manager.beginTransaction()
        val fragment = ProfileFragment()
        transaction.replace(R.id.fragmentHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

         isProfileFragmentLoaded = true
         isChatFragmentLoaded = false
         isNotificationFragmentLoaded = false
         isTimelineFragmentLoaded = false
    }

    fun showTimelineFragment(){
        val transaction = manager.beginTransaction()
        val fragment = TimelineFragment()
        transaction.replace(R.id.fragmentHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

        isProfileFragmentLoaded = false
        isChatFragmentLoaded = false
        isNotificationFragmentLoaded = false
        isTimelineFragmentLoaded = true
    }

    fun showChatFragment(){
        val transaction = manager.beginTransaction()
        val fragment = ChatFragment()
        transaction.replace(R.id.fragmentHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

        isProfileFragmentLoaded = false
        isChatFragmentLoaded = true
        isNotificationFragmentLoaded = false
        isTimelineFragmentLoaded = false
    }

    fun showNotificationFragment(){
        val transaction = manager.beginTransaction()
        val fragment = NotificationFragment()
        transaction.replace(R.id.fragmentHolder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

        isProfileFragmentLoaded = false
        isChatFragmentLoaded = false
        isNotificationFragmentLoaded = true
        isTimelineFragmentLoaded = false
    }
}
