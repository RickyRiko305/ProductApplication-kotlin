package com.example.productapplication

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.productapplication.adapter.ProductAdapter
import com.example.productapplication.model.Products_Response
import com.google.gson.Gson
import com.squareup.okhttp.Callback
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.squareup.okhttp.Response
import java.io.IOException

class ProductListActivity : AppCompatActivity() {

    //var listView: ListView? = null
    //var productsResponse: Products_Response? = null

    var gson: Gson? = null
    var url = ""
    //var client: OkHttpClient? = null
    var request: Request? = null

    //var adapter: ProductAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        var listView = findViewById(R.id.product_listview) as ListView
        //listView.adapter = ProductAdapter(applicationContext,List<Products_Response.ProductsBean?>)
        var intent = intent
        //url = intent.getStringExtra("categoryurl")
        url = getIntent().getStringExtra("categoryurl")
        request = Request.Builder().url(url).build()
        var client = OkHttpClient()
        //request
//        client.newCall(request).enqueue(object : Callback {
//            override fun onFailure(
//                request: Request,
//                e: IOException
//            ) {
//            }
//
//            @Throws(IOException::class)
//            override fun onResponse(response: Response) {
//                if (response.isSuccessful) {
//                    val responseString = response.body().string()
//                    gson = Gson()
//                    var productsResponse = gson!!.fromJson(
//                        responseString,
//                        Products_Response::class.java
//                    )
////                    runOnUiThread(Runnable {
////                        adapter = ProductAdapter(applicationContext, listView.setAdapter(productsResponse.getProducts()))
////                    })
//                    runOnUiThread {
//                        var adapter = ProductAdapter(
//                            applicationContext,
//                            productsResponse.getProducts()
//                        )
//                        listView.setAdapter(adapter)
//                    }
//                    //adapter1 = ProductAdapter(applicationContext,productsResponse.getProducts())
//                }
//            }
//        })
        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(request: Request?, e: IOException?) {
                TODO("Not yet implemented")
            }

            override fun onResponse(response: Response?) {
                if (response?.isSuccessful!!) {
                    val responseString = response.body().string()
                    gson = Gson()
                    var productsResponse = gson!!.fromJson(
                        responseString,
                        Products_Response::class.java
                    )
                    runOnUiThread {
                        var adapter = ProductAdapter(
                            applicationContext,
                            productsResponse.getProducts()
                        )
                        listView.adapter = adapter
                    }
                }
            }
        })

    }
}
