package com.dicoding.ghibahfilm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class lupa : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa)
        var resetbtn : Button = findViewById(R.id.reset_btn)
        resetbtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.reset_btn -> {
                val moveIntent = Intent(this@lupa, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}