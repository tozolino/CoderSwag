package com.example.coderswag.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.Adapter.ProductsRecyclerAdapter
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        val categoryLabel = intent.getStringExtra(EXTRA_CATEGORY)


        adapter = ProductsRecyclerAdapter(this, DataService.getProducts(categoryLabel))

        lvProducts.adapter = adapter

        var spanCount = 2 // DEFAULT FOR PORTRAIT ORIENTATION
        var orientation = resources.configuration.orientation
        var screenSize = resources.configuration.screenWidthDp

        if (orientation == Configuration.ORIENTATION_LANDSCAPE || screenSize > 720) {
            spanCount = 3
        }
            val layoutManager = GridLayoutManager(this, spanCount)
            lvProducts.layoutManager = layoutManager
        }
    }

