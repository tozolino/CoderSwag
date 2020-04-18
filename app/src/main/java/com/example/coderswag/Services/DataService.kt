package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Graphic Hat Black", "$18", "hat2"),
        Product("Devslopes Graphic Hat White", "$18", "hat3"),
        Product("Devslopes Graphic Hat Snapback", "$18", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie1"),
        Product("Devslopes Hoodie Red", "$18", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$18", "hoodie3"),
        Product("Devslopes Black Hoodie", "$18", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray", "$18", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hustle", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digital = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        when (category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digital
        }
    }

}