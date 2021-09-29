package com.trueddns.homenano.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Part1StatesActivity: ComponentActivity() {
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
    val title = "Test"
    val body = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    ExpandableCard(title = title, body = body)
}

@Composable
fun ExpandableCard(title: String, body: String) {

    var expaded by remember { mutableStateOf(false) }
    var expaded2 by remember { mutableStateOf(false) }

    Column {


        Card(
            modifier = Modifier
                .padding(16.dp)
                .shadow(10.dp)
                .fillMaxWidth()
        ) {

            Column(modifier = Modifier.fillMaxWidth()) {

                Text(text = title,Modifier.padding(10.dp), textAlign = TextAlign.Center)

                if (expaded) {

                    Text(
                        text = body,
                        Modifier.padding(10.dp),
                        style = TextStyle(textAlign = TextAlign.Justify)
                    )

                    IconButton(onClick = { expaded = false }) {
                        Text(text = "ปิด", style = TextStyle(color = Color.Black))
                    }
                } else {
                    IconButton(onClick = { expaded = true }) {
                        Text(text = "เปิด", style = TextStyle(color = Color.Red))
                    }
                }
            }
        }

        Card(
            modifier = Modifier
                .padding(16.dp)
                .shadow(10.dp)
                .fillMaxWidth()
        ) {

            Column(modifier = Modifier.fillMaxWidth()) {

                Text(text = title,Modifier.padding(10.dp), textAlign = TextAlign.Center)

                if (expaded2) {

                    Text(
                        text = body,
                        Modifier.padding(10.dp),
                        style = TextStyle(textAlign = TextAlign.Justify)
                    )

                    IconButton(onClick = { expaded2 = false }) {
                        Text(text = "ปิด", style = TextStyle(color = Color.Black))
                    }
                } else {
                    IconButton(onClick = { expaded2 = true }) {
                        Text(text = "เปิด", style = TextStyle(color = Color.Red))
                    }
                }
            }
        }
    }
}