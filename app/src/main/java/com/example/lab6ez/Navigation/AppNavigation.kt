package com.example.lab6ez.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab6ez.Screens.detalles
import com.example.lab6ez.Screens.favoritos
import com.example.lab6ez.Screens.lugares
import com.example.lab6ez.Screens.principal
import com.example.lab6ez.Screens.profile

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController= navController, startDestination= TabScreens.MainScreen.route){
        composable(route = TabScreens.MainScreen.route){
            principal(navController)
        }
        composable(route = TabScreens.DetallesScreen.route){
            detalles(navController)
        }
        composable(route = TabScreens.ListaLugaresScreen.route){
            lugares(navController)
        }
        composable(route = TabScreens.ProfileScreen.route){
            profile(navController)
        }
        composable(route = TabScreens.FavoritosScreen.route){
            favoritos(navController)
        }
    }
}