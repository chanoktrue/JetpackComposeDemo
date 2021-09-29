package com.trueddns.homenano.jetpackcomposedemo

import android.os.Bundle
import android.text.TextUtils
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

class Part7SuperScriptActivity: ComponentActivity() {
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
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        SuperScriptText(normalText = "Hello", superText = "Word!", baseLineShift = BaselineShift.Superscript)
        SuperScriptText(normalText = "Hello", superText = "Word!", baseLineShift = BaselineShift.Subscript)
    }
}

@Composable
private fun SuperScriptText(
    normalText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superText: String,
    superFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal,
    baseLineShift: BaselineShift
) {
    Text(buildAnnotatedString { 
        withStyle(
            style = SpanStyle(
                fontSize = normalFontSize
            )
        ){
            append(normalText)
        }
        withStyle(
            style = SpanStyle(
                fontSize = superFontSize,
                fontWeight = superTextFontWeight,
                baselineShift = baseLineShift
            )
        ){
            append(superText)
        }
    })
}