package com.example.amirnoorinavigation

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = com.example.amirnoorinavigation.R.drawable.ico_tvu),
            contentDescription = "Logo Image"
        )
        TextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "نام") },
        )
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "تاریخ تولد") },
        )
        val context= LocalContext.current
        Button(
            onClick = {

                    navController.navigate("Second/$username/$password")


            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF00FFAA)
            )
        ) {
            Text(
                text = "Login",
                color = Color(0xFFFF3D00)
            )
        }

    }

    fun LoginScreen(){

    }
}
