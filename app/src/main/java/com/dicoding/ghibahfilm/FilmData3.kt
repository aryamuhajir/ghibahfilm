package com.dicoding.ghibahfilm

object FilmData3 {
    private val judulFilmb = arrayOf("Joker",
        "Conjuring",
        "Insidious",
        "Doraemon",
        "Ratatouille",
        "Ashiapman")

    private val filmGambar = intArrayOf(R.drawable.joker,
        R.drawable.conjuring,
        R.drawable.insidious,
        R.drawable.doraemon,
        R.drawable.ratatouille,
        R.drawable.ashiapman)

    val listData3: ArrayList<Film3>
        get() {
            val list = arrayListOf<Film3>()
            for (position in judulFilmb.indices) {
                val film = Film3()
                film.judul = judulFilmb[position]
                film.gambar = filmGambar[position]
                list.add(film)
            }
            return list
        }

}