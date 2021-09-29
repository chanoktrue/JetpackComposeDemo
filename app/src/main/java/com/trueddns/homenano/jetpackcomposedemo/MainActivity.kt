package com.trueddns.homenano.jetpackcomposedemo

//https://www.youtube.com/watch?v=ERBEWmfz6h0&list=PLSrm9z4zp4mEWwyiuYgVMWcDFdsebhM-r&index=1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.trueddns.homenano.jetpackcomposedemo.ui.theme.JetpackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeDemoTheme {
        Greeting("Android")
    }
}


@Preview
@Composable
private fun Home() {
    val myText = "Test"
    val myLists = listOf<String>("AAA", "BBB", "CCC", "DDD")
    NamePicker(myText = myText, myLists = myLists)
}

@Composable
private fun NamePicker(myText: String, myLists: List<String>) {
    Column {
        Text(myText, style = TextStyle(fontSize = 30.sp))

        Divider()

        LazyColumn{
            item(myLists.none()) {
                myLists.forEach { name ->
                    NamePickerItem(name = name)
                }
            }
        }
    }
}

@Composable
private fun NamePickerItem(name: String) {
    Text(
        name,
        Modifier.clickable {
            //todo
        },
        style = TextStyle(color = Color.Red)
    )
}