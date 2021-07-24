package com.dicoding.ghibahfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class register : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var daftarbtn : Button = findViewById(R.id.daftar_login)
        daftarbtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.daftar_login -> {
                val moveIntent = Intent(this@register, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
        }
}