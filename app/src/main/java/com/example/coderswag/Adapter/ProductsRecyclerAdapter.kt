package com.example.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Product
import com.example.coderswag.R

class ProductsRecyclerAdapter(
    val context: Context,
    val products: List<Product>
) : RecyclerView.Adapter<ProductsRecyclerAdapter.ProductHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val view = LayoutInflater.from(parent?.context)
           .inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProducts(products[position], context)
    }


    inner class ProductHolder(itemView: View?) :
        RecyclerView.ViewHolder(itemView!!) {

        val productImage = itemView?.findViewById<ImageView>(R.id.ivProductImage)
        val productLabel = itemView?.findViewById<TextView>(R.id.tvProductName)
        val productPrice = itemView?.findViewById<TextView>(R.id.tvProductPrice)


        fun bindProducts(product: Product, context: Context) {
            var resId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resId)
            productLabel?.text = product.title
            productPrice?.text = product.price
        }
    }
}