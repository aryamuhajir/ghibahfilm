package com.dicoding.ghibahfilm

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val cbremember : CheckBox = findViewById(R.id.checkBox)
        val btnlogin : Button = findViewById(R.id.button_login)
        val lupatext : TextView = findViewById(R.id.lupasandi)
        val daftartext : TextView = findViewById(R.id.daftartext2)
        daftartext.setOnClickListener(this)
        lupatext.setOnClickListener(this)
        btnlogin.setOnClickListener(this)
        cbremember.setOnClickListener(this)
        FacebookSdk.sdkInitialize(applicationContext);
        AppEventsLogger.activateApp(this);
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        val mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.checkBox -> {
                if (checkBox.isChecked) {
                    checkBox.setTextColor(Color.parseColor("#6200EE"))
                } else {
                    checkBox.setTextColor(Color.GRAY)
                }
            }

            R.id.button_login -> {
                val moveIntent = Intent(this@LoginActivity, terbaru::class.java)
                startActivity(moveIntent)
            }

            R.id.lupasandi -> {
                val moveIntent = Intent(this@LoginActivity, lupa::class.java)
                startActivity(moveIntent)
            }

            R.id.daftartext2 -> {
                val moveIntent = Intent(this@LoginActivity, register::class.java)
                startActivity(moveIntent)
            }
        }
    }
}