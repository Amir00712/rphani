package com.example.amirnoorinavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SecondScreen(username: String?,password:Int?) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue) , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        if (password != null) {
            Text(modifier = Modifier.background(color = Color.Green) , text =  "${username} shoma ba sen ${1402 - password} sal vared shode id")
        }


    }
}
