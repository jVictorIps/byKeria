package com.example.bykeria

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bykeria.components.MainScreenLayout
import com.example.bykeria.pages.BikeDatailsScreen
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
        composable("sobre") {
            MainScreenLayout(navController) { paddingValues ->
                BikeDatailsScreen(navController, paddingValues)
            }
        }
        composable("settings") {
            MainScreenLayout(navController) { paddingValues ->
                SettingsScreen(navController, paddingValues)
            }
        }

    }
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}


