package com.trueddns.homenano.jetpackcomposedemo

import android.content.ClipData
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trueddns.homenano.jetpackcomposedemo.lazyDemo.model.Person
import com.trueddns.homenano.jetpackcomposedemo.lazyDemo.repository.PersonRepository

@ExperimentalFoundationApi
class Part14LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomItemSection()
        }
    }
}

@Composable
private fun Home() {

    val personRepository = PersonRepository()
    val getAllData  = personRepository.getAllData()

    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(getAllData) { index, person ->
            Log.e("Item", index.toString())
            CustomItem(person, index)
        }
    }

}

@Composable
fun CustomItem(p: Person, idx: Int) {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${idx}",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${p.firstName}",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "${p.lastName}",
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@ExperimentalFoundationApi
@Preview
@Composable
private fun CustomItemSection() {

    var sections = listOf<String>("A","B","C","D","E","F","I","J","K","L","M","N")

    LazyColumn(
        contentPadding = PaddingValues(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        sections.forEach{ section ->
            stickyHeader {
                Text(
                    text =  "Section $section",
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray)
                        .padding(12.dp)
                )
            }
            items(sections) {
                Text(
                    text = "Item $it form session $section",
                    modifier = Modifier
                        .padding(12.dp)
                )
            }
        }
    }


}