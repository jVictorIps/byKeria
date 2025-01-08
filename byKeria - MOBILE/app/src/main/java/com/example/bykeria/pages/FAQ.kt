package com.example.bykeria.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField

@Composable
fun FAQ(navController: NavController, paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Text(
                    text = "FAQ",
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )
            }
            item {
                FaqItem(
                    question = "Posso alugar mais de uma bike por vez?",
                    answer = "Sim, você pode alugar até 2 bikes por vez!"
                )
            }

            item {
                FaqItem(
                    question = "Tenho que devolver no posto que peguei?",
                    answer = "Não, você pode devolver a bike em qualquer um de nossos postos!"
                )
            }

            item {
                FaqItem(
                    question = "Qual o tempo limite para ficar com a bike?",
                    answer = "Recomendamos que você não passe mais de 3 dias com a bike"
                )
            }
        }

        // Texto antes da barra de pesquisa
        Text(
            text = "Não viu sua dúvida aqui? Nos escreva e vamos te responder!",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Barra de pesquisa
        val searchQuery = remember { mutableStateOf("") }

        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(Color(0xFFFFEB3B), RoundedCornerShape(16.dp))
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            if (searchQuery.value.isEmpty()) {
                Text(
                    text = "Digite sua dúvida aqui",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
            BasicTextField(
                value = searchQuery.value,
                onValueChange = { searchQuery.value = it },
                modifier = Modifier.fillMaxWidth(),
                textStyle = MaterialTheme.typography.body1.copy(
                    color = Color.Black
                )
            )
        }
    }
}

@Composable
fun FaqItem(question: String, answer: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Text(
            text = question,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Black
        )
        Text(
            text = answer,
            fontSize = 14.sp,
            color = Color.DarkGray
        )
    }
}