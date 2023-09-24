package com.example.lab6ez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab6ez.Navigation.AppNavigation
import com.example.lab6ez.Screens.detalles
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Lab6EZTheme {
        AppNavigation()
    }
}