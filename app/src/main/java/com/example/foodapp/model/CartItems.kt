package com.example.foodapp.model

data class CartItems (

    val foodName: String? = null,
    val foodPrice: String? = null,
    val foodDescription: String? = null,
    var foodImage: String? = null,
    val foodQuantity: Int? = null,
    val foodIngredient : String? = null
)