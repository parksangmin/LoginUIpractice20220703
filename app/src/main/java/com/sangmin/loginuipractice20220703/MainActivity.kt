package com.sangmin.loginuipractice20220703

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
            Toast.makeText(this, "회원가입버튼 클릭", Toast.LENGTH_SHORT).show()
        }

//        로그인 로직 실행
        loginBtn.setOnClickListener {
//            아이디 값과 비밀번호 값을 변수함
            val id = idEdt.text.toString() // 아이디값 변수함
            val password = passwordEdt.text.toString() // 비밀번호 변수화
            // 아이디값이 "admin", 패스워드"asdf"
            if (id != "admin") {
                Toast.makeText(this, "아이디가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            // 비밀번호 값 판별
            }else if(password != "asdf" ){
                Toast.makeText(this, "비밀번호가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            //두가지 판별하는 것
            } else{
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}