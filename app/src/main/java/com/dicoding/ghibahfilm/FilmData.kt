package com.dicoding.ghibahfilm

object FilmData {
    private val judulFilmb = arrayOf("Godzilla",
        "Bucin",
        "Joker",
        "Frozen 2",
        "Ashiapman",
        "Ratatouille")
    private val judulFilmbb = arrayOf("godzilla",
        "bucin",
        "joker",
        "frozen 2",
        "ashiapman",
        "ratatouille")

    private val sinopsisFilmB = arrayOf("SINOPSIS GODZILLA",
        "cowok-cowok yang memutuskan untuk keluar dari hubungan tidak sehat.",
        "SINOPSIS JOKER",
        "SINOPSIS FROZEN 2",
        "SINOPSIS ASHIAPMAN",
        "SINOPSIS RATATOUILLE")

    private val musikFilmB = arrayOf("MUSIK GODZILLA",
        "Sheila on 7",
        "MUSIK JOKER",
        "MUSIK FROZEN 2",
        "MUSIK ASHIAPMAN",
        "MUSIK RATATOUILLE")

    private val sutradaraFilmB = arrayOf("SUTRADARA GODZILLA",
        "Chandra Liow",
        "SUTRADARA JOKER",
        "SUTRADARA FROZEN 2",
        "SUTRADARA ASHIAPMAN",
        "SUTRADARA RATATOUILLE")

    private val tahunFilmB = arrayOf("2020",
        "2020",
        "2019",
        "2019",
        "2020",
        "2008")

    private val durasiFilmB = arrayOf("120 Menit",
        "90 Menit",
        "120 Menit",
        "120 Menit",
        "100 Menit",
        "100 Menit")

    private val ratingFilmB = arrayOf("13+",
        "16+",
        "18+",
        "8+",
        "13+",
        "10+")

    private val filmGambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucin,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val reviewGambar = intArrayOf(R.drawable.ic_tenetreview,
        R.drawable.ic_bucinreview,
        R.drawable.ic_tenetreview,
        R.drawable.ic_tenetreview,
        R.drawable.ic_tenetreview,
        R.drawable.ic_tenetreview)

    private val thumbnailGambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucin,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val nama1Gambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucinandovi,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val nama2Gambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucinjovial,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val nama3Gambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucinchandra,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)
    private val nama4Gambar = intArrayOf(R.drawable.godzilla,
        R.drawable.bucintommy,
        R.drawable.joker,
        R.drawable.frozen2,
        R.drawable.ashiapman,
        R.drawable.ratatouille)

    private val nama1FilmB = arrayOf("Wahyudi",
        "Andovi Da Lopez",
        "Danang",
        "Anton",
        "Mamang",
        "Dayat")
    private val nama2FilmB = arrayOf("Wahyudi",
        "Jovial Da Lopez",
        "Danang",
        "Anton",
        "Mamang",
        "Dayat")

    private val nama3FilmB = arrayOf("Wahyudi",
        "Chandra Liow",
        "Danang",
        "Anton",
        "Mamang",
        "Dayat")

    private val nama4FilmB = arrayOf("Wahyudi",
        "Tommy Lim",
        "Danang",
        "Anton",
        "Mamang",
        "Dayat")

    val listData: ArrayList<Film>
        get() {
            val list = arrayListOf<Film>()
            for (position in judulFilmb.indices) {
                val film = Film()
                film.judul = judulFilmb[position]
                film.sinopsis = sinopsisFilmB[position]
                film.musik = musikFilmB[position]
                film.sutradara = sutradaraFilmB[position]
                film.durasi = durasiFilmB[position]
                film.rating = ratingFilmB[position]
                film.tahun = tahunFilmB[position]
                film.sinopsis = sinopsisFilmB[position]
                film.nama1 = nama1FilmB[position]
                film.nama2 = nama2FilmB[position]
                film.nama3 = nama3FilmB[position]
                film.nama4 = nama4FilmB[position]
                film.gambar = filmGambar[position]
                film.review = reviewGambar[position]
                film.thumbnail = thumbnailGambar[position]
                film.nama1G = nama1Gambar[position]
                film.nama2G = nama2Gambar[position]
                film.nama3G = nama3Gambar[position]
                film.nama4G = nama4Gambar[position]
                film.judul2 = judulFilmbb[position]
                list.add(film)
            }
            return list
        }

}