package com.dicoding.ghibahfilm

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listAdapter(private val listFilmm: ArrayList<Film>) : RecyclerView.Adapter<listAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        var tvJudul : TextView = itemView.findViewById(R.id.judul2)
        var imgFilmList : ImageView = itemView.findViewById(R.id.gambar1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var (judul, sinopsis,musik,sutradara,durasi,rating,tahun,nama1,nama2,nama3,nama4,gambar,review,thumbnail,nama1G,nama2G,nama3G,nama4G,judul2) = listFilmm[position]

        Glide.with(holder.itemView.context)
            .load(gambar)
            .into(holder.imgFilmList)
        holder.tvJudul.text = judul

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, infromasi::class.java).apply {
                putExtra(
                    infromasi.EXTRA_SINOPSIS, sinopsis
                )
                putExtra(infromasi.EXTRA_JUDUL, judul2)
                putExtra(infromasi.EXTRA_MUSIK, musik)
                putExtra(infromasi.EXTRA_SUTRADARA, sutradara)
                putExtra(infromasi.EXTRA_TAHUN, tahun)
                putExtra(infromasi.EXTRA_DURASI, durasi)
                putExtra(infromasi.EXTRA_RATING, rating)
                putExtra(infromasi.EXTRA_GAMBAR, gambar)
                putExtra(infromasi.EXTRA_REVIEW, review)
                putExtra(infromasi.EXTRA_NAMA1, nama1)
                putExtra(infromasi.EXTRA_NAMA2, nama2)
                putExtra(infromasi.EXTRA_NAMA3, nama3)
                putExtra(infromasi.EXTRA_NAMA4, nama4)
                putExtra(infromasi.EXTRA_PEMAIN1, nama1G)
                putExtra(infromasi.EXTRA_PEMAIN2, nama2G)
                putExtra(infromasi.EXTRA_PEMAIN3, nama3G)
                putExtra(infromasi.EXTRA_PEMAIN4, nama4G)
                putExtra(infromasi.EXTRA_THUMBNAIL, thumbnail)
                putExtra(infromasi.EXTRA_NAMAPENILAI, "Eko Puji")
                putExtra(infromasi.EXTRA_PENILAIAN, "Jalan cerita yang sangat bagus dan menegangkan")
            }
            mContext.startActivity(moveDetail)


        }


    }

    override fun getItemCount(): Int {
        return listFilmm.size
    }

}