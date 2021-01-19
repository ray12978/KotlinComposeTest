package com.example.kotlincomposetest.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincomposetest.R
import com.example.kotlincomposetest.ui.theme.KotlinComposeTestTheme


@Composable
fun MyButton(){
    Button(){
        Row() {
            MyImage()
            Spacer(modifier = Modifier.preferredHeight(4.dp))
            Text("Button")
        }
    }
    
}

@Composable
fun MyImage(){
    val image  = imageResource(R.drawable.drawable_moon)
    Image(bitmap = image)
}

@Composable
fun Button(
    onClick: (() -> Unit)? = null,
    content: @Composable () -> Unit
){}


@Preview("Button Tester")
@Composable
fun ButtonPreview(){
    KotlinComposeTestTheme {
        MyButton()
    }
}