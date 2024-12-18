package com.example.bykeria.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavController

@Composable
fun SettingsScreen(navController: NavController, paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues), // Respeita os paddings
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Centraliza verticalmente
    ) {
        Text("Tela de Configurações", style = MaterialTheme.typography.h6)

        // Botão para navegar de volta para a Home
        Button(onClick = { navController.navigate("main") }) {
            Text("Voltar para a Home")
        }
    }
}