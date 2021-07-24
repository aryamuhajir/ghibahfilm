package com.dicoding.ghibahfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() , View.OnClickListener {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val daftartext : TextView = findViewById(R.id.daftartext)
            val loginbtn : Button = findViewById(R.id.login_btn)
            loginbtn.setOnClickListener(this)
            daftartext.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            when (v?.id) {
                R.id.login_btn -> {
                    val moveIntent = Intent(this@MainActivity, LoginActivity::class.java)
                    startActivity(moveIntent)
                }
                R.id.daftartext -> {
                    val moveIntent = Intent(this@MainActivity, register::class.java)
                    startActivity(moveIntent)
                }
            }
        }

}