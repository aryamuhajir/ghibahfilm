package com.dicoding.ghibahfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.card.MaterialCardView

class Ulasan : AppCompatActivity(), View.OnClickListener {
    private lateinit var ulasan99 : MaterialCardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulasan)

        ulasan99 = findViewById(R.id.kartureview99)
        ulasan99.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.kartureview99 -> {
                val moveIntent = Intent(this@Ulasan, infromasi::class.java).apply {
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
        }
    }
}