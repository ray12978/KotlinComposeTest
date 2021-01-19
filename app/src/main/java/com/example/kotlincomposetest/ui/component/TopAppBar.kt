package com.example.kotlincomposetest.ui.component

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlincomposetest.ui.theme.KotlinComposeTestTheme

@Composable
fun AppBar(

) {
    TopAppBar(
        title = {
            Text(text = "Compose Appbar", maxLines = 2)//,
            //navigationIcon = Icon()
        },
        navigationIcon = {
            //Icon(painter = Icons.Filled.AccessTime)
        }
    )
}

@Preview
@Composable
fun MyAppBarPreview(){
    KotlinComposeTestTheme {
        AppBar()
    }
}