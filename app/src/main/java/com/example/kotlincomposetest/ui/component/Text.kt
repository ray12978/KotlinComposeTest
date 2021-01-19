package com.example.kotlincomposetest.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincomposetest.R
import com.example.kotlincomposetest.ui.layout.*
import com.example.kotlincomposetest.ui.theme.KotlinComposeTestTheme
import com.example.kotlincomposetest.ui.theme.white

@Composable
fun LayoutsCodelab() {
    val fabShape = CircleShape
    val scaffoldState = rememberScaffoldState()
    val moonImage : ImageBitmap = imageResource(R.drawable.icon_hair_dryer)
    val fabModifier = Modifier
        .preferredHeight(50.dp)
        .preferredWidth(50.dp)
        //.background(white)
        //.fillMaxSize()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "LayoutsCodelab")
                },
                actions = {
                    IconButton(onClick = { println("Like") }) {
                        //Icon(Icons.Filled.Favorite)
                        Icon(Icons.Filled.DirectionsSubway)
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(cutoutShape = fabShape) {
                IconButton(onClick = {
                    scaffoldState.drawerState.open()
                }) {
                    Icon(Icons.Filled.Menu)
                }
                // The actions should be at the end of the BottomAppBar
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.Favorite)
                }
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.Call)
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                shape = fabShape,
                onClick = {},
                backgroundColor = white
            ) {
                Image(moonImage,modifier = fabModifier)
            }

        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }

}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text(text = "Hi there!", Modifier.firstBaselineToTop(32.dp))
        Text(
            text = "Thanks for going through the Layouts codelab",
            Modifier.firstBaselineToTop(32.dp)
        )
    }
    MyOwnColumn(
        Modifier
            .firstBaselineToTop(100.dp)
    ) {
        Text("test1")
        Text("test2")
    }
}


@Preview
@Composable
fun TextPreview() {
    KotlinComposeTestTheme() {
        LayoutsCodelab()
    }
}