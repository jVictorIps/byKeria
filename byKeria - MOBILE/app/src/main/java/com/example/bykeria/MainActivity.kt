package com.example.bykeria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bykeria.components.MainScreenLayout
import com.example.bykeria.components.bikesAduList
import com.example.bykeria.components.bikesInfList
import com.example.bykeria.pages.BikeAduDetailsScreen
import com.example.bykeria.pages.BikeInfDetailsScreen
import com.example.bykeria.pages.FAQ
import com.example.bykeria.pages.HomeScreen
import com.example.bykeria.pages.SettingsScreen
import com.example.bykeria.pages.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("main") {
            MainScreenLayout(navController) { paddingValues ->
                HomeScreen(navController, paddingValues)
            }
        }
        composable("detalhesadu") {
            // Agora passando a lista bikesList corretamente
            MainScreenLayout(navController) { paddingValues ->
                BikeAduDetailsScreen(
                    navController = navController,
                    paddingValues = paddingValues,
                    bikes = bikesAduList, // Passando a lista de bicicletas real
                    onBikeSelected = { selectedBike ->
                        // Ação ao selecionar uma bicicleta
                        println("Bicicleta selecionada: ${selectedBike.modelo}")
                    },
                    onFavoriteToggle = { toggledBike ->
                        // Ação ao alternar o favorito
                        println("Favorito alternado: ${toggledBike.modelo}")
                    }
                )
            }
        }

        composable("detalhesinf") {
            // Agora passando a lista bikesList corretamente
            MainScreenLayout(navController) { paddingValues ->
                BikeInfDetailsScreen(
                    navController = navController,
                    paddingValues = paddingValues,
                    bikes = bikesInfList, // Passando a lista de bicicletas real
                    onBikeSelected = { selectedBike ->
                        // Ação ao selecionar uma bicicleta
                        println("Bicicleta selecionada: ${selectedBike.modelo}")
                    },
                    onFavoriteToggle = { toggledBike ->
                        // Ação ao alternar o favorito
                        println("Favorito alternado: ${toggledBike.modelo}")
                    }
                )
            }
        }
        composable("settings") {
            MainScreenLayout(navController) { paddingValues ->
                SettingsScreen(navController, paddingValues)
            }
        }
        composable("FAQ") {
            MainScreenLayout(navController) { paddingValues ->
                FAQ(navController, paddingValues)
            }
        }
    }
}







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}

