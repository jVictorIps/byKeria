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
import com.example.bykeria.components.Bike
import com.example.bykeria.components.BikesListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BikeDetailsScreen(
    navController: NavController, paddingValues: PaddingValues,
    bikes: List<Bike>, // Lista de bicicletas
    onBikeSelected: (Bike) -> Unit, // Callback para selecionar uma bicicleta
    onFavoriteToggle: (Bike) -> Unit // Callback para favoritar/desfavoritar
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
                    BikesListItem(
                        bike = bike,
                        onBikeSelected = onBikeSelected,
                        onFavoriteToggle = onFavoriteToggle // Aqui não precisa de paddingValues
                    )
                }
            }
        }
    )
}
