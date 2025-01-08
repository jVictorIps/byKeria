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
import com.example.bykeria.ui.theme.ByKeriaTheme

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
    var isDarkTheme by remember { mutableStateOf(false) } // Controle do tema

    ByKeriaTheme(darkTheme = isDarkTheme) { // Utilize o tema definido
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
                MainScreenLayout(navController) { paddingValues ->
                    BikeAduDetailsScreen(
                        navController = navController,
                        paddingValues = paddingValues,
                        bikes = bikesAduList,
                        onBikeSelected = { selectedBike ->
                            println("Bicicleta selecionada: ${selectedBike.modelo}")
                        },
                        onFavoriteToggle = { toggledBike ->
                            println("Favorito alternado: ${toggledBike.modelo}")
                        }
                    )
                }
            }

            composable("detalhesinf") {
                MainScreenLayout(navController) { paddingValues ->
                    BikeInfDetailsScreen(
                        navController = navController,
                        paddingValues = paddingValues,
                        bikes = bikesInfList,
                        onBikeSelected = { selectedBike ->
                            println("Bicicleta selecionada: ${selectedBike.modelo}")
                        },
                        onFavoriteToggle = { toggledBike ->
                            println("Favorito alternado: ${toggledBike.modelo}")
                        }
                    )
                }
            }
            composable("settings") {
                MainScreenLayout(navController) { paddingValues ->
                    SettingsScreen(
                        navController = navController,
                        paddingValues = paddingValues,
                        isDarkTheme = isDarkTheme, // Estado do tema
                        onToggleTheme = { isDarkTheme = !isDarkTheme } // Alterna o tema
                    )
                }
            }

            composable("FAQ") {
                MainScreenLayout(navController) { paddingValues ->
                    FAQ(navController, paddingValues)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
