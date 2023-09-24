package com.example.lab6ez.Navigation

sealed class TabScreens(val route: String){
    object MainScreen: TabScreens("main")
    object DetallesScreen: TabScreens("detalles")
    object ListaLugaresScreen: TabScreens("lugares")
    object ProfileScreen: TabScreens("profile")
}
