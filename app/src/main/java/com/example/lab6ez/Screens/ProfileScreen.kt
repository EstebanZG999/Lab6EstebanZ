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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab6ez.Navigation.AppNavigation
import com.example.lab6ez.R
import com.example.lab6ez.ui.theme.Lab6EZTheme

class Profile : ComponentActivity() {
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
fun profile(navController: NavController) {
    Column() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Blue), contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagen1),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .padding(top = 16.dp)
                    .background(Color.Black, shape = CircleShape.also { })
                    .height(140.dp)
            ) {
                Column() {
                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.imagen3),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Text(
                text = "Esteban Zambrano",
                modifier = Modifier.padding(top = 250.dp),
                color = Color.White,
                fontSize = 24.sp, fontStyle = FontStyle.Italic
            )

        }
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Row {

                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.imagen3),
                        contentDescription = null,
                    )

                    Text(
                        text = "Edit Profile",
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .padding(horizontal = 25.dp),
                        fontSize = 22.sp
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

        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Row {

                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.candado2),
                        contentDescription = null
                    )

                    Text(
                        text = "Reset Password",
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .padding(horizontal = 25.dp),
                        fontSize = 22.sp
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

        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Row {

                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.profilepic),
                        contentDescription = null
                    )

                    Text(
                        text = "Notifications",
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .padding(horizontal = 25.dp),
                        fontSize = 22.sp
                    )

                    Image(modifier = Modifier.padding(horizontal = 20.dp), painter = painterResource(id = R.drawable.imagen4),
                        contentDescription = null)
                }
            }

        }

        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(100.dp)
                .fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Row {

                    Image(
                        modifier = Modifier
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.estrella2),
                        contentDescription = null
                    )

                    Text(
                        text = "Favoritos",
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .padding(horizontal = 25.dp),
                        fontSize = 22.sp
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