package com.alex.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alex.myapplication.databinding.RegisterActivityBinding


class Signup  : AppCompatActivity() {

    lateinit var registerActivityBinding: RegisterActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerActivityBinding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(registerActivityBinding.root)
        supportActionBar?.apply {
            hide()
        }
        registerActivityBinding.backbutton.setOnClickListener {
            @Suppress("DEPRECATION")
            super.onBackPressed()
        }

        //confirm pass logic
        registerActivityBinding.password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val password = registerActivityBinding.password.text.toString()
                val confirmPassword = registerActivityBinding.confirmpass.text.toString()

                if (password != confirmPassword) {
                    registerActivityBinding.confirmpass.error = "Passwords does not match"
                    registerActivityBinding.confirmpassnback.isEndIconVisible = false
                } else {
                    registerActivityBinding.confirmpass.error = null
                    registerActivityBinding.confirmpassnback.isEndIconVisible = true
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        registerActivityBinding.confirmpass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val password = registerActivityBinding.password.text.toString()
                val confirmPassword = registerActivityBinding.confirmpass.text.toString()

                if (password != confirmPassword) {
                    registerActivityBinding.confirmpass.error = "Passwords does not match"
                    registerActivityBinding.confirmpassnback.isEndIconVisible = false
                } else {
                    registerActivityBinding.confirmpass.error = null
                    registerActivityBinding.confirmpassnback.isEndIconVisible = true
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })


    }

    fun alreadyuser(view: View) {
        @Suppress("DEPRECATION")
        super.onBackPressed()
    }

    @Deprecated(
        "Deprecated in Java", ReplaceWith(
            "@Suppress(\"DEPRECATION\") super.onBackPressed()",
            "androidx.appcompat.app.AppCompatActivity"
        )
    )
    override fun onBackPressed() {
        @Suppress("DEPRECATION")
        super.onBackPressed()
    }

}