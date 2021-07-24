package com.dicoding.ghibahfilm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.ButtonBarLayout
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.bottomnavigation.BottomNavigationView

class terbaru : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terbaru)



        var bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomBar)
        var navController = findNavController(R.id.my_nav_host_fragment)

        bottomNavigationView.setupWithNavController(navController)

    }




}