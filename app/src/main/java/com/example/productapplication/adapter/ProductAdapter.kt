package com.example.productapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.productapplication.R
import com.example.productapplication.model.Products_Response
import com.example.productapplication.model.Products_Response.ProductsBean
import com.squareup.picasso.Picasso
import java.util.zip.Inflater

class ProductAdapter(context: Context?,item: List<Products_Response.ProductsBean?>?) : BaseAdapter(){

    private var items: List<Products_Response.ProductsBean>? = null
    private var context: Context? = context
    //private var inflater: Inflater? = null

//    class ProductAdapter(context: Context, items: List<Products_Response.ProductsBean>){
//        this.context = context
//
//    }

//    fun ProductAdapter(
//        context: Context?,
//        items: List<ProductsBean?>?
//    ) {
//        this.context = context
//        this.items = items as List<ProductsBean>?
//    }
    init {
        items = item as List<Products_Response.ProductsBean>?
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView =
            inflater.inflate(R.layout.product_list_style, viewGroup, false)
        val item = getItem(position) as ProductsBean
        val thumbnail = rowView.findViewById<View>(
            R.id.img_id1
        ) as ImageView
        val name = rowView.findViewById<View>(
            R.id.txt_id1
        ) as TextView
        val price = rowView.findViewById<View>(
            R.id.txt_id2
        ) as TextView
        val availability = rowView.findViewById<View>(
            R.id.txt_id3
        ) as TextView
        val image = item.image
        Picasso.with(context).load(image).into(thumbnail)
        name.text = item.name
        price.text = item.salePrice
        availability.text = item.onlineAvailabilityText
        return rowView
    }

    override fun getItem(position: Int): Any {

        return items!![position]
    }

    override fun getItemId(p0: Int): Long {

        return 0
    }

    override fun getCount(): Int {

        return items?.size!!//items!!.size
    }

}