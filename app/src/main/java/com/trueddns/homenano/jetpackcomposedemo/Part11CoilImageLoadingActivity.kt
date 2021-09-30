package com.trueddns.homenano.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



class Part11CoilImageLoadingActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Preview
@Composable
private  fun Home() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CoilImage()
    }
}

@Composable
private fun CoilImage() {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center

    ){
         //rememberImagePainter
    }
}