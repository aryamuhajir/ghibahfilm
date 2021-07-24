package com.dicoding.ghibahfilm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [category.newInstance] factory method to
 * create an instance of this fragment.
 */
class category : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var rvFilm: RecyclerView
    private var list: ArrayList<Film> = arrayListOf()
    private lateinit var rvFilm2: RecyclerView
    private var list2: ArrayList<Film2> = arrayListOf()
    private lateinit var rvFilm3: RecyclerView
    private var list3: ArrayList<Film3> = arrayListOf()

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
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvFilm = view.findViewById(R.id.rv_film)
        rvFilm.setHasFixedSize(true)
        rvFilm2 = view.findViewById(R.id.rv_film2)
        rvFilm2.setHasFixedSize(true)
        rvFilm3 = view.findViewById(R.id.rv_film3)
        rvFilm3.setHasFixedSize(true)

        list.addAll(FilmData.listData)
        list2.addAll(FilmData2.listData2)
        list3.addAll(FilmData3.listData3)
        showRecyclerList()

    }
    private fun showRecyclerList() {
        rvFilm.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvFilm2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvFilm3.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val listHeroAdapter = listAdapter(list)
        val listHeroAdapter2 = listAdapter2(list2)
        val listHeroAdapter3 = listAdapter3(list3)
        rvFilm.adapter = listHeroAdapter
        rvFilm2.adapter = listHeroAdapter2
        rvFilm3.adapter = listHeroAdapter3
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment category.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            category().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}