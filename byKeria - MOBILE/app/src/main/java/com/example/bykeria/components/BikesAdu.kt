package com.example.bykeria.components

import com.example.bykeria.R


data class BikeAdu(
    val id: Int,
    val type: String,
    val modelo: String,
    val categoria: String,
    val eletrica: Boolean,
    val description: String,
    val imageRes: Int,
    var isFavorite: Boolean = false
)

val bikesAduList = listOf(
    BikeAdu(
        id = 1,
        type = "Adulto",
        modelo = "Monark",
        categoria = "Urbana",
        eletrica = false,
        description = "Modelo ideal para pequenos passeios na praça da cidade.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 2,
        type = "Adulto",
        modelo = "Caloi Elite",
        categoria = "Mountain Bike",
        eletrica = true,
        description = "Bicicleta elétrica para trilhas desafiadoras e terrenos acidentados.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 3,
        type = "Adulto",
        modelo = "Soul SL",
        categoria = "Esporte",
        eletrica = false,
        description = "Modelo esportivo leve, ideal para ciclismo de alta performance.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 4,
        type = "Adulto",
        modelo = "Sense Easy",
        categoria = "Urbana",
        eletrica = true,
        description = "Bicicleta elétrica com design moderno, ideal para o dia a dia na cidade.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 5,
        type = "Adulto",
        modelo = "Oggi Lite",
        categoria = "Passeio",
        eletrica = false,
        description = "Confortável e estável, perfeita para passeios tranquilos e relaxantes.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 6,
        type = "Adulto",
        modelo = "Cannondale Urban",
        categoria = "Urbana",
        eletrica = true,
        description = "Bicicleta elétrica prática, projetada para deslocamentos rápidos na cidade.",
        imageRes = R.drawable.bike
    ),
    BikeAdu(
        id = 7,
        type = "Adulto",
        modelo = "Track Pro",
        categoria = "Esporte",
        eletrica = false,
        description = "Modelo esportivo robusto, ideal para treinos e provas de ciclismo.",
        imageRes = R.drawable.bike
    )
)
