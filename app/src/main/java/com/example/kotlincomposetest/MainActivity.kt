package com.example.kotlincomposetest

import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.annotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlincomposetest.ui.KotlinComposeTestTheme
import com.example.kotlincomposetest.ui.typography
import kotlin.random.Random
import androidx.compose.foundation.Text as Text1

class MainActivity : AppCompatActivity() {
    private val imageUrl = R.drawable.liyu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Composable
fun Greeting(name: String) {
    val image = imageResource(R.drawable.header)
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(Modifier.padding(16.dp)) {
            val imageModifier = Modifier
                    .preferredHeight(180.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))

            Image(image,
                    modifier = imageModifier,
                    contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text("A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw",
                    style = typography.h6)
            Text("YOLO",
                    style = typography.body2)
            Text("You Only Live Once",
                    style = typography.body1)
        }
    }
}

@Composable
fun UserPhoto(
        imageUrl: ImageBitmap,
        modifier: Modifier = Modifier
) {
    val ringColor = remember { randomColor() }
    Image(
            imageUrl,
            modifier = modifier
                    .border(2.dp, ringColor, CircleShape)
                    .padding(4.dp)
                    .clip(CircleShape)
                    .size(38.dp)


    )

}

fun randomColor(): Color = Color(
        red = Random.nextInt(0, 255),
        green = Random.nextInt(0, 255),
        blue = Random.nextInt(0, 255)
)

@Composable
fun CoilImage(imageUrl: String, modifier: Modifier) {

}

@Composable
fun JetChat() {
    Column() {

        Row {
            Text("Liyu")
            Text("4:30 PM")
        }
        Surface() {
            ChatText(
                    "昨日ファンクラブ生配信の時クリスマスぽい" +
                            "なケーキ食べてきた 幸せ～"
            )
        }

    }


}

fun parseAnnotated(
        text: String
): AnnotatedString{
    val tokens = tokenizer.findAll(text)
    return annotatedString{

    }
}

sealed class Content{
    class Text(val text: String): Content()
    class Sticker(val sticker: Image): Content()
}

@Composable
fun ChatMessage(
        authorName: String,
        authorImageUrl: ImageBitmap,
        dateSend: String,
        message: List<Content>
){

}


@Composable
fun ChatText(text: String) {
    val annotated = parseAnnotated(text)
    Text(annotated, style = typography.body1)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinComposeTestTheme {
        //Greeting("Android")
    }
}