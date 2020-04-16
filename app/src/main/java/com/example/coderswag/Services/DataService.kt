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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Graphic Hat Black", "$18", "hat02"),
        Product("Devslopes Graphic Hat White", "$18", "hat03"),
        Product("Devslopes Graphic Hat Snapback", "$18", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$18", "hoodie01"),
        Product("Devslopes Hoodie Red", "$18", "hoodie02"),
        Product("Devslopes Gray Hoodie", "$18", "hoodie03"),
        Product("Devslopes Black Hoodie", "$18", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Badge Light Gray", "$18", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$18", "shirt03"),
        Product("Devslopes Hustle", "$18", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}