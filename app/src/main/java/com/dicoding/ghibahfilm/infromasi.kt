package com.dicoding.ghibahfilm

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.marginStart
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jackandphantom.blurimage.BlurImage
import com.jgabrielfreitas.core.BlurImageView


class infromasi : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_GAMBAR = "extra_gambar"
        const val EXTRA_REVIEW = "extra_review"
        const val EXTRA_SUTRADARA = "extra_sutradara"
        const val EXTRA_SINOPSIS = "extra_sinopsis"
        const val EXTRA_DURASI = "extra_durasi"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_MUSIK = "extra_musik"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_PEMAIN1 = "extra_pemain1"
        const val EXTRA_PEMAIN2 = "extra_pemain2"
        const val EXTRA_PEMAIN3 = "extra_pemain3"
        const val EXTRA_PEMAIN4 = "extra_pemain4"
        const val EXTRA_NAMA1 = "extra_nama1"
        const val EXTRA_NAMA2 = "extra_nama2"
        const val EXTRA_NAMA3 = "extra_nama3"
        const val EXTRA_NAMA4 = "extra_nama4"
        const val EXTRA_THUMBNAIL = "extra_thumbnail"
        const val EXTRA_PENILAIAN = "extra_penilaian"
        const val EXTRA_NAMAPENILAI = "extra_namapenilai"







    }
    private lateinit var navControllern : NavController

    override fun setActionBar(toolbar: Toolbar?) {
        super.setActionBar(toolbar)
        actionBar?.setTitle("SADASD")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infromasi)

        navControllern = findNavController(R.id.my_nav_host_fragment2)
        setupActionBarWithNavController(navControllern)
        actionBar?.setTitle("Asdadas")





        val gambarFilm : BlurImageView = findViewById(R.id.gambarfilmd)
        val gambarKartu : ImageView = findViewById(R.id.gambarkartu)
        val gambarReview : ImageView = findViewById(R.id.review)
        val textSutradara : TextView = findViewById(R.id.sutradara)
        val textSinopsis : TextView = findViewById(R.id.sinopsis)
        val textMusik : TextView = findViewById(R.id.musik)
        val textDurasi : TextView = findViewById(R.id.durasi)
        val textTahun : TextView = findViewById(R.id.tahun)
        val textTahun2 : TextView = findViewById(R.id.tahun2)
        val textRating : TextView = findViewById(R.id.rating)
        val textRating2 : TextView = findViewById(R.id.rating2)
        val trailer : CardView = findViewById(R.id.trailer)
        val pemain1 : ImageView = findViewById(R.id.pemain1)
        val pemain2 : ImageView = findViewById(R.id.pemain2)
        val pemain3 : ImageView = findViewById(R.id.pemain3)
        val pemain4 : ImageView = findViewById(R.id.pemain4)
        val thumbnail : ImageView = findViewById(R.id.thumbnail)
        val nama1 : TextView = findViewById(R.id.nama1)
        val nama2 : TextView = findViewById(R.id.nama2)
        val nama3 : TextView = findViewById(R.id.nama3)
        val nama4 : TextView = findViewById(R.id.nama4)









        trailer.setOnClickListener(this)

        val tSutradara = intent.getStringExtra(EXTRA_SUTRADARA)
        val tDurasi = intent.getStringExtra(EXTRA_DURASI)
        val tRating = intent.getStringExtra(EXTRA_RATING)
        val tTahun = intent.getStringExtra(EXTRA_TAHUN)
        val tMusik = intent.getStringExtra(EXTRA_MUSIK)
        val tSinopsis = intent.getStringExtra(EXTRA_SINOPSIS)
        val tGambarF = intent.getIntExtra(EXTRA_GAMBAR, 0)
        val tGambarR = intent.getIntExtra(EXTRA_REVIEW,0)
        val tJudul = intent.getStringExtra(EXTRA_JUDUL)
        val tP1 = intent.getIntExtra(EXTRA_PEMAIN1,0)
        val tP2 = intent.getIntExtra(EXTRA_PEMAIN2,0)
        val tP3 = intent.getIntExtra(EXTRA_PEMAIN3,0)
        val tP4 = intent.getIntExtra(EXTRA_PEMAIN4,0)
        val tThumbanil = intent.getIntExtra(EXTRA_THUMBNAIL,0)
        val tN1 = intent.getStringExtra(EXTRA_NAMA1)
        val tN2 = intent.getStringExtra(EXTRA_NAMA2)
        val tN3 = intent.getStringExtra(EXTRA_NAMA3)
        val tN4 = intent.getStringExtra(EXTRA_NAMA4)
        val nAma = intent.getStringExtra(EXTRA_NAMAPENILAI)
        val pEn = intent.getStringExtra(EXTRA_PENILAIAN)



        textSinopsis.text = tSinopsis
        nama1.text = tN1
        nama2.text = tN2
        nama3.text = tN3
        nama4.text = tN4



        textDurasi.text = tDurasi
        textTahun.text = tTahun
        textRating.text = tRating
        textSutradara.text = tSutradara
        textMusik.text = tMusik

        Glide.with(this)
            .load(tGambarF)
            .apply(RequestOptions())
            .into(gambarKartu)
        Glide.with(this)
            .load(tP1)
            .apply(RequestOptions())
            .into(pemain1)
        Glide.with(this)
            .load(tP2)
            .apply(RequestOptions())
            .into(pemain2)

        Glide.with(this)
            .load(tP3)
            .apply(RequestOptions())
            .into(pemain3)

        Glide.with(this)
            .load(tP4)
            .apply(RequestOptions())
            .into(pemain4)

        Glide.with(this)
            .load(tThumbanil)
            .apply(RequestOptions())
            .into(thumbnail)
        if (tJudul == "Ashiapman" || tJudul == "SOUL" || tJudul == "WandaVision" || tJudul == "Wonder Woman 1984"){
            gambarReview.setVisibility(View.GONE)
            textRating.setVisibility(View.GONE)
            textTahun.setVisibility(View.GONE)
            textTahun2.setVisibility(View.VISIBLE)
            textRating2.setVisibility(View.VISIBLE)
        }else{
            textTahun2.setVisibility(View.GONE)
            textRating2.setVisibility(View.GONE)
        }


        when (tJudul){
            "Tenet" -> {

                gambarReview.setImageResource(R.drawable.ic_tenetreview)
                BlurImage.with(applicationContext).load(R.drawable.tenet22).intensity(20F).Async(true).into(gambarFilm);
            }
            "Bucin"-> {

                gambarReview.setImageResource(R.drawable.ic_bucinreview)
                BlurImage.with(applicationContext).load(R.drawable.bucin).intensity(20F).Async(true).into(gambarFilm);
            }
            "Enola" -> {

                gambarReview.setImageResource(R.drawable.ic_enolareview)
                BlurImage.with(applicationContext).load(R.drawable.enola).intensity(20F).Async(true).into(gambarFilm);
            }
            "Mulan" -> {

                gambarReview.setImageResource(R.drawable.ic_mulanreview)
                BlurImage.with(applicationContext).load(R.drawable.mulan2).intensity(20F).Async(true).into(gambarFilm);
            }
            "Godzilla" -> {
                BlurImage.with(applicationContext).load(R.drawable.godzilla2).intensity(20F).Async(true).into(gambarFilm);
            }
            "Joker" -> {
                BlurImage.with(applicationContext).load(R.drawable.joker).intensity(20F).Async(true).into(gambarFilm);
            }
            "Frozen 2" -> {
                BlurImage.with(applicationContext).load(R.drawable.frozen2).intensity(20F).Async(true).into(gambarFilm);
            }
            "Ashiapman" -> {
                BlurImage.with(applicationContext).load(R.drawable.ashiapman).intensity(20F).Async(true).into(gambarFilm);
            }
            "Ratatouille" -> {
                BlurImage.with(applicationContext).load(R.drawable.ratatouille).intensity(20F).Async(true).into(gambarFilm);
            }
            "Wonder Woman 1984" -> {
                textRating2.text = tRating
                textTahun2.text = tTahun
                BlurImage.with(applicationContext).load(R.drawable.wonderwoman).intensity(20F).Async(true).into(gambarFilm);
            }
            "Soul" -> {
                textRating2.text = tRating
                textTahun2.text = tTahun
                BlurImage.with(applicationContext).load(R.drawable.soul).intensity(20F).Async(true).into(gambarFilm);
            }
        }
        setTitle(tJudul)







    }

    override fun onClick(v: View?) {
        val tJudul = intent.getStringExtra(EXTRA_JUDUL)
        var linkyutub : String = "https://youtu.be/KK8FHdFluOQ"


        when (v?.id) {
            R.id.trailer -> {
                when (tJudul){
                    "Tenet" -> {
                        linkyutub = "https://www.youtube.com/watch?v=L3pk_TBkihU"

                    }
                    "Bucin" -> {
                        linkyutub = "https://www.youtube.com/watch?v=xSdAC9WSJ5s"

                    }
                    "Enola Holmes" -> {
                        linkyutub = "https://youtu.be/1d0Zf9sXlHk"
                    }
                    "Wonder Woman 1984" -> {
                        linkyutub = "https://youtu.be/XW2E2Fnh52w"
                    }
                    "Mulan" -> {
                        linkyutub =  "https://youtu.be/KK8FHdFluOQ"
                    }
                    "Soul" -> {
                        linkyutub =  "https://youtu.be/xOsLIiBStEs"
                    }

                }
                val moveActivity = Intent(Intent.ACTION_VIEW, Uri.parse(linkyutub))
                moveActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                moveActivity.setPackage("com.google.android.youtube")
                startActivity(moveActivity)




            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navControllern.navigateUp() || super.onSupportNavigateUp()
    }
}
