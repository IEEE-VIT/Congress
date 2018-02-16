package com.ieeevit.congress.Activity


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.widget.FrameLayout
import com.ieeevit.congress.Fragments.ChatFragment
import com.ieeevit.congress.Fragments.NotificationFragment
import com.ieeevit.congress.Fragments.ProfileFragment
import com.ieeevit.congress.Fragments.TimelineFragment
import com.ieeevit.congress.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.fragmentHolder) as FrameLayout
        val navigation = findViewById(R.id.bottom_nav_bar) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        val fragment = TimelineFragment()
        addFragment(fragment)
    }

    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener {

        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.bm_timeline -> {
                    addFragment(TimelineFragment())
                    return true
                }
                R.id.bm_chat -> {
                    addFragment(ChatFragment())
                    return true
                }
                R.id.bm_notifications -> {
                    addFragment(NotificationFragment())
                    return true
                }
                R.id.bm_profile -> {
                    addFragment(ProfileFragment())
                    return true
                }
            }
            return false
        }

    }

    /**
     * add/replace fragment in container [framelayout]
     */
    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentHolder, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }
}
