package com.dicoding.ghibahfilm

object FilmData2 {

    private val judulFilmc = arrayOf("Frozen 2",
        "Hotel Transylvania 2",
        "Doraemon",
        "Ratatouille",
        "Ashiapman",
        "Ratatouille")

    private val filmGambar2 = intArrayOf(R.drawable.frozen2,
        R.drawable.hotel2,
        R.drawable.doraemon,
        R.drawable.ratatouille,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    val listData2: ArrayList<Film2>
        get() {
            val list2 = arrayListOf<Film2>()
            for (position in judulFilmc.indices) {
                val film = Film2()
                film.judul = judulFilmc[position]
                film.gambar = filmGambar2[position]
                list2.add(film)
            }
            return list2
        }
}