package com.dicoding.ghibahfilm

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [tabshome.newInstance] factory method to
 * create an instance of this fragment.
 */
class tabshome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private  lateinit var toolbar: Toolbar
    private lateinit var viewPager : ViewPager2
    private lateinit var tabsLayout : TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabshome, container, false)




    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar = view.findViewById(R.id.toolsbar)
        viewPager = view.findViewById(R.id.view_pager)
        tabsLayout = view.findViewById(R.id.tab_layout)

        viewPager.adapter = tabshome.ViewPagerAdapter(this)

        tabsLayout.setBackgroundColor(Color.parseColor("#0E0C0C"))
        tabsLayout.setTabTextColors(Color.parseColor("#565665"), Color.parseColor("#FFFFFF"))
        tabsLayout.setSelectedTabIndicatorColor(Color.parseColor("#8036E7"))

        TabLayoutMediator(tabsLayout, viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> { tab.text = "Terbaru"}
                    1 -> { tab.text = "Segera"}
                    2 -> { tab.text = "Trending"}
                }
            }).attach()

    }
    private class ViewPagerAdapter(fragmentActivity: tabshome) :
        FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {
            when (position){
                0 -> return DaftarFilm()
                1 -> return DaftarFilm2()
                else -> return DaftarFilm3()
            }

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment tabshome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            tabshome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}