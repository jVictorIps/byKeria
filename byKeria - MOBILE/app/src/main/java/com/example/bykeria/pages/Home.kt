package com.example.bykeria.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bykeria.R

@Composable
fun HomeScreen(navController: NavController, paddingValues: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background), // Usando a cor do tema
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Dê uma olhada nas nossas Bikes!",
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center
            )

            // Card para bikes para adultos
            Card(
                modifier = Modifier
                    .size(200.dp)
                    .clickable {
                        navController.navigate("detalhesadu") // Navegação para "detalhesadu"
                    },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp) // Usando CardDefaults para definir a elevação
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bikesadul), // Imagem da bike para adultos
                    contentDescription = "Bikes para adultos",
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = "Bikes para adultos",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )

            // Card para bikes para crianças
            Card(
                modifier = Modifier
                    .size(200.dp)
                    .clickable {
                        navController.navigate("detalhesinf") // Navegação para "detalhesinf"
                    },
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp) // Usando CardDefaults para definir a elevação
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bikeskid), // Imagem da bike para crianças
                    contentDescription = "Bikes para crianças",
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(
                text = "Bikes para crianças",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
            )
        }
    }
}
