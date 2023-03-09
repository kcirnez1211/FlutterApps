package com.example.weather_app_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weather_app_ui.ui.theme.Weather_app_uiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather_app_uiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}
@Composable
fun WeatherCard(image: Int) {
    Card(
        modifier = Modifier
            .height(height = 200.dp)
            .width(width = 170.dp), shape = RoundedCornerShape(size = 30.dp)

    )
    {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }

}


@Composable
fun HomeScreen() {
    val image = painterResource(id = R.drawable.whatsapp_image_2022_09_30_at_17_22_06)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}
