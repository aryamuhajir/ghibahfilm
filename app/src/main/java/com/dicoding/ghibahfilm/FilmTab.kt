package com.dicoding.ghibahfilm

object FilmTab {
    private val judulFilmb = arrayOf("Tenet",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val sutradaraa = arrayOf("Christoper Nolan",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val filmGambar = intArrayOf(R.drawable.tenet22,
        R.drawable.bucin,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val filmReview = intArrayOf(R.drawable.ic_tenetreview,
        R.drawable.bucin,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val durasia = arrayOf("120 Menit",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val ratinga = arrayOf("18+",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val tahuna = arrayOf("2020",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val musika = arrayOf("Peterpan",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")

    private val sinopsisa = arrayOf("A secret agent embarks on a dangerous, time-bending mission to prevent the start of World War III.",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")




    val listData: ArrayList<FilmTabT>
        get() {
            val list = arrayListOf<FilmTabT>()
            for (position in judulFilmb.indices) {
                val film = FilmTabT()
                film.judul = judulFilmb[position]
                film.gambar = filmGambar[position]
                film.rating = ratinga[position]
                film.sinopsis = sinopsisa[position]
                film.tahun = tahuna[position]
                film.musik = musika[position]
                film.durasi = durasia[position]
                film.review = filmReview[position]
                film.sutradara = sutradaraa[position]
                list.add(film)
            }
            return list
        }

}