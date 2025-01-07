package com.example.bykeria.components

import com.example.bykeria.R


data class BikeInf(
    val id: Int,
    val type: String,
    val modelo: String,
    val categoria: String,
    val eletrica: Boolean,
    val description: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val bikesInfList = listOf(
    BikeInf(
        id = 1,
        type = "Infantil",
        modelo = "Caloi",
        categoria = "Urbana",
        eletrica = false,
        description = "Modelo ideal para pequenos passeios de suas pequenas crianças.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 2,
        type = "Infantil",
        modelo = "Monark Kids",
        categoria = "Mountain Bike",
        eletrica = true,
        description = "Bicicleta elétrica ideal para trilhas leves e diversão ao ar livre.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 3,
        type = "Infantil",
        modelo = "Soul Jr.",
        categoria = "Esporte",
        eletrica = false,
        description = "Design esportivo para crianças que adoram aventura.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 4,
        type = "Infantil",
        modelo = "Sense Little",
        categoria = "Urbana",
        eletrica = true,
        description = "Modelo elétrico perfeito para passeios pela cidade.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 5,
        type = "Infantil",
        modelo = "Oggi Mini",
        categoria = "Passeio",
        eletrica = false,
        description = "Bicicleta compacta e segura para passeios tranquilos no parque.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 6,
        type = "Infantil",
        modelo = "Cannondale Kid",
        categoria = "Esporte",
        eletrica = true,
        description = "Bicicleta elétrica leve e resistente para pequenas aventuras.",
        imageRes = R.drawable.bike
    ),
    BikeInf(
        id = 7,
        type = "Infantil",
        modelo = "Track Baby",
        categoria = "Passeio",
        eletrica = false,
        description = "Modelo confortável e seguro para crianças em qualquer passeio.",
        imageRes = R.drawable.bike
    )
)
