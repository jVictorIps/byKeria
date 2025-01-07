package com.example.bykeria.pages
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.bykeria.components.BikeAdu
import com.example.bykeria.components.BikesAduListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BikeAduDetailsScreen(
    navController: NavController, paddingValues: PaddingValues,
    bikes: List<BikeAdu>, // Lista de bicicletas
    onBikeSelected: (BikeAdu) -> Unit, // Callback para selecionar uma bicicleta
    onFavoriteToggle: (BikeAdu) -> Unit // Callback para favoritar/desfavoritar
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Lista de Bicicletas",
                        style = MaterialTheme.typography.titleLarge // Estilo do Material3
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        content = { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                items(bikes) { bike ->
                    BikesAduListItem(
                        bike = bike,
                        onBikeSelected = onBikeSelected,
                        onFavoriteToggle = onFavoriteToggle // Aqui não precisa de paddingValues
                    )
                }
            }
        }
    )
}
