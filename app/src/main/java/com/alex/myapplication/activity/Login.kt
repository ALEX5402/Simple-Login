package com.alex.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alex.myapplication.R
import com.alex.myapplication.Signup
import com.alex.myapplication.databinding.LoginActivityBinding

class Login : AppCompatActivity() {

    lateinit var login1 : LoginActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login1 = LoginActivityBinding.inflate(layoutInflater)

        setContentView(login1.root)
        supportActionBar?.apply {
            hide()
        }



    }
    fun forgotpassword( view: View) {

    }

    fun signup ( view : View) {
        startActivity(Intent(this, Signup::class.java))
        overridePendingTransition(R.anim.slide_left, R.anim.slide_right)

    }


}

