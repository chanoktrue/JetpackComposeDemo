package com.trueddns.homenano.jetpackcomposedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

class Part9TextFieldsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Preview
@Composable
private fun Home() {

    var text by remember { mutableStateOf("Type here...") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text)

//        TextField(
        OutlinedTextField(
            value = text,
            onValueChange = { newText -> text = newText },
            label = { Text(text = "Title") },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email icon"
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = {
                    Log.e("Trialin icon", "Clicked")
                }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Email icon"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.e("ImeAction", "Clicked")
                }
            )
        )
        // End TextFile
        
        BasicTextField(
            value =  text,
            onValueChange = {},
            modifier = Modifier
                .background(Color.LightGray)
                .padding(16.dp)

        )
        
    }
}

