package com.sangmin.loginuipractice20220703

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// toast  같은 경우에는 로그와 달리, 화면의 문장을 보여준다(사용자가 알 수 있다)
//  간단한 알림!

        singUpBtn.setOnClickListener {
            // 비행기 티켓을 발권(출발지 : this(MainActivity -> 목적지(SignUpActivity)
            val myIntent = Intent(this,SignUpActivity::class.java)
            startActivity(myIntent)
        }

        loginBtn.setOnClickListener {  }



    }
}

