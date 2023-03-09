package com.example.nftapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nftapp.ui.theme.NFTAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFTAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun HomePageWithImage(s1: String, s2: String, s3: String,navController: NavController) {
    val image = painterResource(id = R.drawable.javier_miranda_mrwocgkfvdg_unsplash_1)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentScale = ContentScale.Crop
    )
    HomePageWithText(s1 = s1, s2 = s2, s3 = s3,navController=navController)
}

@Composable
fun HomePageWithText(s1: String, s2: String, s3: String,navController: NavController) {
    Column {
        Text(
            text = s1,
            color = Color.White,
            fontSize = 48.sp,
            modifier = Modifier.padding(start = 60.dp, top = 100.dp),
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = s2,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 80.dp, top = 230.dp),
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = s3,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 40.dp, top = 10.dp, end = 25.dp),
            fontWeight = FontWeight.ExtraBold
        )
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 117.dp, top = 35.dp)) {
            Text(text = "Get Started Now", fontSize = 16.sp, fontWeight = FontWeight.ExtraBold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePageWithText() {
    NFTAppTheme {
        HomePageWithImage(
            s1 = "Welcome to NFT Marketplace",
            s2 = "Explore and Mint NFTs",
            s3 = "You can buy and sell the NFTs of the best artists in the worlds"
        )
    }
}