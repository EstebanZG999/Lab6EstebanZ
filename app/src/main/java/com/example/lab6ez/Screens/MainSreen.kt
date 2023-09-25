package com.example.lab6ez.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6ez.Navigation.AppNavigation
import com.example.lab6ez.Navigation.TabScreens
import com.example.lab6ez.R
import com.example.lab6ez.ui.theme.Lab6EZTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6EZTheme {
                AppNavigation()
            }
        }
    }
}


@Composable
fun principal(navController: NavController) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .background(Color.LightGray)
            ) {
                Row() {
                    Text(
                        text = "TodoEventos+",
                        modifier = Modifier
                            .padding(12.dp),
                        fontSize = 32.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(75.dp)) {
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.boton),
                            contentDescription = null
                        )
                    }

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .background(Color.LightGray)
            ) {
                LazyRow(){
                    item {

                        Button(onClick = { navController.navigate(route = TabScreens.DetallesScreen.route)}) {
                            Text(text = "Detalles")
                        }

                        Button(onClick = { navController.navigate(route = TabScreens.ListaLugaresScreen.route) }) {
                            Text(text = "Lista Lugares")
                        }

                        Button(onClick = { navController.navigate(route = TabScreens.ProfileScreen.route) }) {
                            Text(text = "Profile")
                        }
                        Button(onClick = { navController.navigate(route = TabScreens.FavoritosScreen.route) }) {
                            Text(text = "Favoritos")
                        }
                    }

                }
            }

            Row() {
                Box(modifier = Modifier.padding(6.dp)) {
                    Text(
                        text = "Tus Favoritos",
                        modifier = Modifier
                            .padding(12.dp),
                        fontSize = 28.sp
                    )
                }

            }

            Box(modifier = Modifier)
            {
                Column() {
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.dualipa3),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Dua Lipa",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Majadas 11",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.taylorswit),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Taylor Swift",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Estadio Mateo Flores",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }

                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.enanosverdes),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Enanitos Verdes",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Casa de Kou",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.vicentefernandez2),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Vicente Fernandez",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Cayala",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.skrillex),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Skrillex",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "EMF",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier.size(165.dp),
                                    painter = painterResource(id = R.drawable.djgura2),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "DJ GURA",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Meza's Grill",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }
                }
            }
            Row() {
                Box(modifier = Modifier.padding(6.dp)) {
                    Text(
                        text = "Todos los conciertos",
                        modifier = Modifier
                            .padding(12.dp),
                        fontSize = 28.sp
                    )
                }

            }
            Box(modifier = Modifier)
            {
                Column() {
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.deadmau5),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Deadmau5",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Tomorrowland",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.meli),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Esposo de Meli",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "El Cielo",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }

                    Row() {
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.pipozach4),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "Pipo Zachrisson",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Zona 6",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .width(185.dp)
                                .height(240.dp)
                                .padding(10.dp)
                                .clickable { navController.navigate(route = TabScreens.DetallesScreen.route) },
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(modifier = Modifier.fillMaxSize()) {
                                Image(
                                    modifier = Modifier,
                                    painter = painterResource(id = R.drawable.luisag2),
                                    contentDescription = null
                                )
                                Text(
                                    modifier = Modifier.padding(top = 170.dp, start = 15.dp),
                                    text = "NandaDJ",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(top = 190.dp, start = 15.dp),
                                    text = "Tomorrowland",
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}