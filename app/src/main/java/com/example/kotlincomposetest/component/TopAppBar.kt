package com.example.kotlincomposetest.component

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlincomposetest.R
import com.example.kotlincomposetest.ui.KotlinComposeTestTheme
import java.lang.reflect.Modifier

@Composable
fun AppBar(

) {
    TopAppBar(
        title = {
            Text(text = "Compose Appbar", maxLines = 2)//,
            //navigationIcon = Icon()
        },
        navigationIcon = {
            //Icon(ImageVector = R.drawable.drawable_moon,modifier = Modifier = Color(0xff12324))
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