package com.example.bykeria.components

import com.example.bykeria.R


data class Bike(
    val id: Int,
    val type: String,
    val modelo: String,
    val categoria: String,
    val eletrica: Boolean,
    val description: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val bikesList = listOf(
    Bike(
        id = 1,
        type = "Adulto",
        modelo = "Monark",
        categoria = "Urbana",
        eletrica = false,
        description = "Modelo ideal para pequenos passeios na praças da cidade.",
        imageRes = R.drawable.bike
    ),
)
