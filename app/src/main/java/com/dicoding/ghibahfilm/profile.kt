package com.dicoding.ghibahfilm

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.card.MaterialCardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [profile.newInstance] factory method to
 * create an instance of this fragment.
 */
class profile : Fragment(R.layout.fragment_profile), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var mulanReview : CardView
    private lateinit var ulasanT : TextView


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
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mulanReview = view.findViewById(R.id.cardView4)
        mulanReview.setOnClickListener(this)
        ulasanT = view.findViewById(R.id.textView9)
        ulasanT.setOnClickListener(this)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment profile.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            profile().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cardView4 -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "Untuk menyelamatkan ayahnya yang sakit agar tidak bertugas di Tentara Kekaisaran, seorang wanita muda yang tak kenal takut menyamar sebagai pria untuk melawan penjajah utara di Tiongkok."
                    )
                    putExtra(infromasi.EXTRA_MUSIK, "Christina Aguilera")
                    putExtra(infromasi.EXTRA_JUDUL, "Mulan")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Niki Caro")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "120 Menit")
                    putExtra(infromasi.EXTRA_RATING, "13+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.mulan2)
                    putExtra(infromasi.EXTRA_REVIEW, R.drawable.ic_mulanreview)
                    putExtra(infromasi.EXTRA_NAMA1, "Liu Yifei")
                    putExtra(infromasi.EXTRA_NAMA2, "Donnie Yen")
                    putExtra(infromasi.EXTRA_NAMA3, "Jason Scott Lee")
                    putExtra(infromasi.EXTRA_NAMA4, "Gong Li")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.mulanliu)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.mulandonnie)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.mulanjason)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.mulangong)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.mulanthumbnail)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Arya Muhajir")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Menurut saya lumayan sih")

                }
                startActivity(moveIntent)
            }
            R.id.textView9 -> {
                val moveIntent = Intent(activity, Ulasan::class.java)
                startActivity(moveIntent)
            }
        }


    }
}