package com.dicoding.ghibahfilm

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.activity_infromasi.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DaftarFilm.newInstance] factory method to
 * create an instance of this fragment.
 */
class DaftarFilm : Fragment(R.layout.fragment_daftar_film),View.OnClickListener {
    private lateinit var tenet : MaterialCardView
    private lateinit var bucin : MaterialCardView
    private lateinit var enola : MaterialCardView
    private lateinit var mulan : MaterialCardView



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tenet = view.findViewById(R.id.kartutenet)
        tenet.setOnClickListener(this)
        bucin = view.findViewById(R.id.kartubucin)
        bucin.setOnClickListener(this)
        enola = view.findViewById(R.id.kartuenola)
        enola.setOnClickListener(this)
        mulan = view.findViewById(R.id.kartumulan)
        mulan.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.kartutenet -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "A secret agent embarks on a dangerous, time-bending mission to prevent the start of World War III."
                    )
                    putExtra(infromasi.EXTRA_JUDUL, "Tenet")
                    putExtra(infromasi.EXTRA_MUSIK, "Peterpan")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Christoper Nolan")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "120 Menit")
                    putExtra(infromasi.EXTRA_RATING, "18+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.tenet22)
                    putExtra(infromasi.EXTRA_REVIEW, R.drawable.ic_bucinreview)
                    putExtra(infromasi.EXTRA_NAMA1, "Robert Pattinson")
                    putExtra(infromasi.EXTRA_NAMA2, "Clémence Poésy")
                    putExtra(infromasi.EXTRA_NAMA3, "John David")
                    putExtra(infromasi.EXTRA_NAMA4, "Elizabeth Debicki")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.robert)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.tenetclemence)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.tenetjohn)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.tenetelizabeth)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.tenetthumbnail)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Eko Puji")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Jalan cerita yang sangat bagus dan menegangkan")


                }
                startActivity(moveIntent)

            }
            R.id.kartubucin -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "Cowok-cowok yang memutuskan untuk keluar dari hubungan tidak sehat."
                    )
                    putExtra(infromasi.EXTRA_MUSIK, "Sheila on 7")
                    putExtra(infromasi.EXTRA_JUDUL, "Bucin")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Chandra Liow")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "90 Menit")
                    putExtra(infromasi.EXTRA_RATING, "16+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.bucin)
                    putExtra(infromasi.EXTRA_REVIEW, R.drawable.ic_bucinreview)
                    putExtra(infromasi.EXTRA_NAMA1, "Andovi Da Lopez")
                    putExtra(infromasi.EXTRA_NAMA2, "Jovial Da Lopez")
                    putExtra(infromasi.EXTRA_NAMA3, "Chandra Liow")
                    putExtra(infromasi.EXTRA_NAMA4, "Tommylim")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.bucinandovi)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.bucinjovial)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.bucinchandra)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.bucintommy)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.bucin)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Arya Muhajir")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Menurut saya lumayan sih")

                }
                startActivity(moveIntent)
            }

            R.id.kartuenola -> {
                val moveIntent = Intent(activity, infromasi::class.java).apply {
                    putExtra(
                        infromasi.EXTRA_SINOPSIS,
                        "Tepat di hari ulang tahunya ke 16, Enola mendapati ibunya pergi meninggalkanya dengan meninggalkan sebuah kode dan decoder sebagai petunjuk untuk menemukan ibunya."
                    )
                    putExtra(infromasi.EXTRA_MUSIK, "Daniel Pamberton")
                    putExtra(infromasi.EXTRA_JUDUL, "Enola Holmes")
                    putExtra(infromasi.EXTRA_SUTRADARA, "Harry Bradbeer")
                    putExtra(infromasi.EXTRA_TAHUN, "2020")
                    putExtra(infromasi.EXTRA_DURASI, "123 Menit")
                    putExtra(infromasi.EXTRA_RATING, "13+")
                    putExtra(infromasi.EXTRA_GAMBAR, R.drawable.enola)
                    putExtra(infromasi.EXTRA_REVIEW, R.drawable.ic_enolareview)
                    putExtra(infromasi.EXTRA_NAMA1, "Millie Bobby B")
                    putExtra(infromasi.EXTRA_NAMA2, "Sam Claflin")
                    putExtra(infromasi.EXTRA_NAMA3, "Henry Cavill")
                    putExtra(infromasi.EXTRA_NAMA4, "Helena Carter")
                    putExtra(infromasi.EXTRA_PEMAIN1, R.drawable.enolamillie)
                    putExtra(infromasi.EXTRA_PEMAIN2, R.drawable.enolahelena)
                    putExtra(infromasi.EXTRA_PEMAIN3, R.drawable.enolahenry)
                    putExtra(infromasi.EXTRA_PEMAIN4, R.drawable.enolasam)
                    putExtra(infromasi.EXTRA_THUMBNAIL, R.drawable.enolathumbnail)
                    putExtra(infromasi.EXTRA_NAMAPENILAI, "Arya Muhajir")
                    putExtra(infromasi.EXTRA_PENILAIAN, "Menurut saya lumayan sih")

                }
                startActivity(moveIntent)
            }
            R.id.kartumulan -> {
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

        }

    }
}