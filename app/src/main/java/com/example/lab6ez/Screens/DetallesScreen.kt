package com.example.lab6ez.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6ez.Navigation.AppNavigation
import com.example.lab6ez.Navigation.TabScreens
import com.example.lab6ez.R
import com.example.lab6ez.ui.theme.Lab6EZTheme

class Detalles : ComponentActivity() {
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
fun detalles(navController: NavController) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
                .background(Color.Blue),
        ){

            Image(
                painter = painterResource(id = R.drawable.concierto2),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                text = "CASA DE KOU ",
                modifier = Modifier.padding(top = 300.dp),
                color = Color.White,
                fontSize = 24.sp, fontStyle = FontStyle.Italic
            )

            Button(modifier = Modifier.width(100.dp).height(50.dp).padding(vertical = 5.dp), onClick = { navController.popBackStack()}) {
                Text(text = "Atras")
            }
        }

        Row() {
            Text(
                text = "Concierto: Kou enaniando",
                modifier = Modifier.padding(5.dp),
                color = Color.Black,
                fontSize = 28.sp,
            )
        }

        Box(
            modifier = Modifier.padding(10.dp)

        ){
            Column(){

                Box(modifier = Modifier.padding(5.dp)){
                    Row() {
                        Image(modifier = Modifier.size(60.dp),
                            painter = painterResource(id = R.drawable.calendariopng),
                            contentDescription = null)

                        Text(
                            text = "Fecha: 24/9/2023",
                            modifier = Modifier.padding(15.dp),
                            color = Color.Black,
                            fontSize = 24.sp,
                        )
                    }
                }

                Box(modifier = Modifier.padding(5.dp)){
                    Row() {
                        Image(modifier = Modifier.size(60.dp),
                            painter = painterResource(id = R.drawable.reloj),
                            contentDescription = null)

                        Text(
                            text = "Hora: 20:00",
                            modifier = Modifier.padding(20.dp),
                            color = Color.Black,
                            fontSize = 24.sp,
                        )
                    }
                }

            }

        }

        Box(modifier = Modifier.padding(horizontal = 10.dp)){
            Column() {
                Text(text = "Acerca del concierto: ",
                    modifier = Modifier.padding(1.dp),
                    color = Color.Black,
                    fontSize = 20.sp,)

                Text(text = "El mejor concierto que puede existir, los enanos verdes y la casa de Kou en un mismo lugar! La mejor combinacion de la vida. Obtenga sus entradas ya disponibles con JP",
                    modifier = Modifier.padding(1.dp),
                    color = Color.Black,
                    fontSize = 16.sp,)

            }
        }
        Box(modifier = Modifier.padding(10.dp)){
            Row() {
                Spacer(modifier = Modifier.width(100.dp))
                Button(onClick = { navController.navigate(route = TabScreens.FavoritosScreen.route)}) {
                    Text(text = "Agregar a Favoritos")
                }
            }
        }
    }
}