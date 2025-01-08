package com.example.bykeria.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavController



@Composable
fun SettingsScreen(
    navController: NavController,
    paddingValues: PaddingValues,
    isDarkTheme: Boolean, // Recebe o estado atual do tema
    onToggleTheme: () -> Unit // Callback para alternar o tema
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background) // Define o fundo com base no tema
            .padding(paddingValues), // Respeita os paddings
        horizontalAlignment = Alignment.Start, // Alinhamento dos itens na coluna
        verticalArrangement = Arrangement.Top // Alinhamento vertical dos itens
    ) {
        Text(
            text = "Configurações",
            style = MaterialTheme.typography.headlineSmall, // Substituto para o h6
            color = MaterialTheme.colorScheme.onBackground, // Cor do texto com base no tema
            modifier = Modifier.padding(16.dp)
        )

        // Cartão para o Modo Escuro
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            elevation = 4.dp,
            backgroundColor = if (isDarkTheme) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.background
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Modo Escuro", style = MaterialTheme.typography.bodyLarge)
                Switch(
                    checked = isDarkTheme, // Estado atual do Switch
                    onCheckedChange = { onToggleTheme() } // Alterna o tema ao mudar o estado
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botão para navegar de volta para a Home
        Button(
            onClick = { navController.navigate("main") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text("Voltar para a Home")
        }
    }
}
