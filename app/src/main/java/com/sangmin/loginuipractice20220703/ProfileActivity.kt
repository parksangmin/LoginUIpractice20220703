package com.sangmin.loginuipractice20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("name")
        val birthYear = intent.getStringExtra("birthYear")
        val nickname = intent.getStringExtra("nickname")

        nameTxt.text = name
        birthTxt.text = birthYear
        nickTxt.text = nickname
    }
}