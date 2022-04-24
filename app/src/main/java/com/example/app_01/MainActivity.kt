package com.example.app_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1.화면 클릭 하는 것을 인지
        val image1 = findViewById<ImageView>(R.id.bts01)
        //image1로 변수 설정 후 bts01이라는 id를 찾고 image1에 담아 둔다
        //image1 이 클릭되면 메시지를 띄워라
        image1.setOnClickListener {
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_SHORT).show()

            //2. 화면이 클릭되면 다음 화면으로 넘어가서 사진을 크게 보여줘라
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


        }
        //7개의 이미지들의 이름을 다 붙이고 클릭 시 다른 액티비티로 이동 시키기
        val image2 = findViewById<ImageView>(R.id.bts02)
        val image3 = findViewById<ImageView>(R.id.bts03)
        val image4 = findViewById<ImageView>(R.id.bts04)
        val image5 = findViewById<ImageView>(R.id.bts05)
        val image6 = findViewById<ImageView>(R.id.bts06)
        val image7 = findViewById<ImageView>(R.id.bts07)
        val image8 = findViewById<ImageView>(R.id.bts08)
        val image9 = findViewById<ImageView>(R.id.bts09)

        image2.setOnClickListener {
         val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        image8.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        image9.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

    }
}