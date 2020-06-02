package com.example.productapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var categoryurl :String? = null
    //private var intent: Intent? = Intent(applicationContext,ProductListActivity.class)

//    private var phone: CardView? = null //phone,computer,laptop,tv,homeTheatre,table,fitness,headPhone;
//    private var computer: CardView? = null
//    private var laptop: CardView? = null
//    private var tv: CardView? = null
//    private var homeTheatre: CardView? = null
//    private var tablet: CardView? = null
//    private var fitness: CardView? = null
//    private var headPhone: CardView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        phone = findViewById(R.id.phone)
//        computer = findViewById(R.id.computer)
//        laptop = findViewById(R.id.laptop)
//        tv = findViewById(R.id.tv)
//        homeTheatre = findViewById(R.id.homeTheatre)
//        tablet = findViewById(R.id.tablet)
//        fitness = findViewById(R.id.fitness)
//        headPhone = findViewById(R.id.headPhone)

        phone.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat209400050001))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        computer.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=abcat0501000))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        laptop.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=abcat0502000))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        tv.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=abcat0101000))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        homeTheatre.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat241600050001))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        tablet.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat209000050006))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        fitness.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=pcmcat242800050021))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
        headPhone.setOnClickListener {
            var intent = Intent(applicationContext,ProductListActivity::class.java)
            categoryurl = "https://api.bestbuy.com/v1/products((categoryPath.id=abcat0204000))?apiKey=evtrx3mbnq2ewwx5swdt62du&pageSize=40&format=json"
            intent.putExtra("categoryurl",categoryurl)
            startActivity(intent)
        }
    }
}
