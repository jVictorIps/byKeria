package com.example.bykeria.pages

import androidx.activity.ComponentActivity
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
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), // Padding externo da coluna
            verticalArrangement = Arrangement.spacedBy(16.dp), // Espaçamento vertical entre os itens
            horizontalAlignment = Alignment.CenterHorizontally // Centraliza horizontalmente
        ) {
            Text(
                text = "Dê uma olhada nas nossas Bikes!",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center // Alinha o texto ao centro
            )

            // Imagem clicável para adultos
            Image(
                painter = painterResource(id = R.drawable.bikesadul), // Substitua pelo seu arquivo
                contentDescription = "Bikes para adultos",
                modifier = Modifier
                    .size(200.dp) // Define o tamanho da imagem
                     // Adiciona cantos arredondados
                    .clickable {
                        navController.navigate("detalhes") // Navegação
                    }
            )

            Text(
                text = "Bikes para adultos",
                textAlign = TextAlign.Center
            )

            // Imagem clicável para crianças
            Image(
                painter = painterResource(id = R.drawable.bikeskid), // Substitua pelo seu arquivo
                contentDescription = "Bikes para crianças",
                modifier = Modifier
                    .size(200.dp) // Define o tamanho da imagem
                    .clip(RoundedCornerShape(16.dp)) // Adiciona cantos arredondados
                    .clickable {
                        navController.navigate("sobre") // Navegação
                    }
            )

            Text(
                text = "Bikes para crianças",
                textAlign = TextAlign.Center
            )
        }
    }
}

