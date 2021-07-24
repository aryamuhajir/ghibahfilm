package com.dicoding.ghibahfilm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listAdapter2(private val listFilmm: ArrayList<Film2>) : RecyclerView.Adapter<listAdapter2.ListViewHolder>() {



    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        var tvJudul : TextView = itemView.findViewById(R.id.judul2)
        var imgFilmList : ImageView = itemView.findViewById(R.id.gambar1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var (judul, gambar) = listFilmm[position]

        Glide.with(holder.itemView.context)
            .load(gambar)
            .into(holder.imgFilmList)
        holder.tvJudul.text = judul


    }

    override fun getItemCount(): Int {
        return listFilmm.size
    }
}