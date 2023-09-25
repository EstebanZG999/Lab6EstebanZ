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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6ez.Navigation.AppNavigation
import com.example.lab6ez.R
import com.example.lab6ez.ui.theme.Lab6EZTheme

class ListaLugares : ComponentActivity() {
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
fun lugares(navController: NavController) {
    Column {
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ){
            Box(
                modifier = Modifier.padding(10.dp)

            ){
                Row() {
                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.dualipa2),
                        contentDescription = null
                    )
                    Column() {
                        Text(
                            text = "Dua Lipa",
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Majadas 11",
                            modifier = Modifier
                                .padding(top = 0.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 18.sp
                        )
                    }
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
        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ){
            Box(
                modifier = Modifier.padding(10.dp)

            ){
                Row() {
                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.taylorswit),
                        contentDescription = null
                    )
                    Column() {
                        Text(
                            text = "Taylor Swift",
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Estadio Mateo Flores",
                            modifier = Modifier
                                .padding(top = 0.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 18.sp
                        )
                    }
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
        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ){
            Box(
                modifier = Modifier.padding(10.dp)

            ){
                Row() {
                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.vicentefernandez2),
                        contentDescription = null
                    )
                    Column() {
                        Text(
                            text = "Vicente Fernandez",
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Cayala",
                            modifier = Modifier
                                .padding(top = 0.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 18.sp
                        )
                    }
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
        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ){
            Box(
                modifier = Modifier.padding(10.dp)

            ){
                Row() {
                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.enanosverdes),
                        contentDescription = null
                    )
                    Column() {
                        Text(
                            text = "Enanitos Verdes",
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 20.sp
                        )
                        Text(
                            text = "Casa de Kou",
                            modifier = Modifier
                                .padding(top = 0.dp)
                                .padding(horizontal = 25.dp),
                            fontSize = 18.sp
                        )
                    }
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
        }
        Box(modifier = Modifier.padding(10.dp)){
            Row() {
                Spacer(modifier = Modifier.width(150.dp))
                Button(onClick = { navController.popBackStack()}) {
                    Text(text = "Atras")
                }
            }
        }
    }
}