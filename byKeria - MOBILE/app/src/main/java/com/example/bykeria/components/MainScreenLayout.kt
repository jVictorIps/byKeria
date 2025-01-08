package com.example.bykeria.components


import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bykeria.R

@Composable
fun MainScreenLayout(navController: NavController, content: @Composable (PaddingValues) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("byKeria") },
                backgroundColor = MaterialTheme.colorScheme.primary, // Cor de fundo da barra
                contentColor = MaterialTheme.colorScheme.onPrimary, // Cor do texto/ícone
                actions = {
                    IconButton(onClick = { expanded = true }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "Menu",
                            tint = MaterialTheme.colorScheme.onPrimary // Cor do ícone
                        )
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        DropdownMenuItem(onClick = {
                            expanded = false
                            navController.navigate("settings")
                        }) {
                            Text("Configurações")
                        }
                        DropdownMenuItem(onClick = {
                            expanded = false
                            navController.navigate("sobre")
                        }) {
                            Text("Sobre")
                        }
                        DropdownMenuItem(onClick = {
                            expanded = false
                            navController.navigate("FAQ")
                        }) {
                            Text("FAQ")
                        }

                        DropdownMenuItem(onClick = {
                            (navController.context as? ComponentActivity)?.finish()
                        }) {
                            Text("Sair")
                        }
                    }
                }
            )
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ) {
                BottomNavigationItem(
                    selected = selectedItem == 1,
                    onClick = {
                        selectedItem = 1
                        navController.navigate("settings")
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.settings),
                            contentDescription = "Settings",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    selectedContentColor = MaterialTheme.colorScheme.secondary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )

                BottomNavigationItem(
                    selected = selectedItem == 0,
                    onClick = {
                        selectedItem = 0
                        navController.navigate("main")
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Home",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    selectedContentColor = MaterialTheme.colorScheme.secondary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )

                BottomNavigationItem(
                    selected = selectedItem == 2,
                    onClick = {
                        selectedItem = 2
                        navController.navigate("sobre")
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.bike),
                            contentDescription = "Other",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    selectedContentColor = MaterialTheme.colorScheme.secondary,
                    unselectedContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        },
        content = { paddingValues -> content(paddingValues) } // Usa o conteúdo passado como parâmetro
    )
}