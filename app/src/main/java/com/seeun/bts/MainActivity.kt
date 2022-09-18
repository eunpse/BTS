package com.seeun.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면 클릭
        //2. 화면 클릭되면 다음 화면으로 넘어가서 사진 확대
        //7개 image들에 이름을 붙이고, 각각 클릭 시 다른 이미지로 이동

        val image1 = findViewById<ImageView>(R.id.btsImage1)
        val image2 = findViewById<ImageView>(R.id.btsImage2)
        val image3 = findViewById<ImageView>(R.id.btsImage3)
        val image4 = findViewById<ImageView>(R.id.btsImage4)
        val image5 = findViewById<ImageView>(R.id.btsImage5)
        val image6 = findViewById<ImageView>(R.id.btsImage6)
        val image7 = findViewById<ImageView>(R.id.btsImage7)

        image1.setOnClickListener {
            var intent = Intent(this, BTS1Activity::class.java)
            startActivity(intent)
        }
        image2.setOnClickListener {
            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, BTS3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, BTS4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, BTS5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, BTS6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, BTS7Activity::class.java)
            startActivity(intent)
        }
    }
}