package com.dicoding.ghibahfilm

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.card.MaterialCardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFilm2.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaftarFilm2 : Fragment(R.layout.fragment_daftar_film2),View.OnClickListener {
    private lateinit var wonder : MaterialCardView
    private lateinit var soul : MaterialCardView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wonder = view.findViewById(R.id.kartuwonder)
        wonder.setOnClickListener(this)
        soul = view.findViewById(R.id.kartusoul)
        soul.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.kartuwonder -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "Wonder Woman bertanding melawan Maxwell Lord dan Cheetah, seorang penjahat yang memiliki kekuatan dan kelincahan manusia super."
                    )
                    putExtra(infromasi.EXTRA_MUSIK, "Sebastian Bohm")
                    putExtra(infromasi.EXTRA_JUDUL, "Wonder Woman 1984")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Patty Jenkins")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "151 Menit")
                    putExtra(infromasi.EXTRA_RATING, "13+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.wonderwoman)
                    putExtra(infromasi.EXTRA_NAMA1, "Gal Gadot")
                    putExtra(infromasi.EXTRA_NAMA2, "Chris Pine")
                    putExtra(infromasi.EXTRA_NAMA3, "Kristen Wiig")
                    putExtra(infromasi.EXTRA_NAMA4, "Pedro Pascal")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.wondergal)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.wonderchris)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.wonderkristen)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.wonderpedro)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.wonderthumbnail)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Arya Muhajir")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Menurut saya lumayan sih")

                }
                startActivity(moveIntent)
            }

            R.id.kartusoul -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "Joe adalah seorang guru band sekolah menengah yang hidupnya tidak berjalan sesuai harapannya. Tetapi ketika dia melakukan perjalanan ke alam lain untuk membantu seseorang menemukan hasratnya, dia segera menemukan apa artinya memiliki jiwa."
                    )
                    putExtra(infromasi.EXTRA_MUSIK, "AJR")
                    putExtra(infromasi.EXTRA_JUDUL, "Soul")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Pete Docter")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "100 Menit")
                    putExtra(infromasi.EXTRA_RATING, "13+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.soul)
                    putExtra(infromasi.EXTRA_NAMA1, "Daveed Diggs")
                    putExtra(infromasi.EXTRA_NAMA2, "Jamie Foxx")
                    putExtra(infromasi.EXTRA_NAMA3, "Phylicia Rashad")
                    putExtra(infromasi.EXTRA_NAMA4, "Tina Fey")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.souldaveed)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.souljamie)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.soulphy)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.soultina)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.soulthumbnail)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Arya Muhajir")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Menurut saya lumayan sih")

                }
                startActivity(moveIntent)
            }

        }
    }
}



