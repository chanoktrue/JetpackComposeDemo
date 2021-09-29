package com.trueddns.homenano.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trueddns.homenano.jetpackcomposedemo.ui.theme.Typography
import java.lang.reflect.Type

class Part2FuncActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Home2()
        }
    }
}

@Preview
@Composable
fun Home2() {
    CustomText(text = "Kotlin Compose")
}

@Composable
fun CustomText(text: String) {
    
    Column {
        Text(text = "Learn")
        Text(
            text = text,
            style = Typography.h5
        )        
    }

}