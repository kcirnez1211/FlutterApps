package com.example.nftapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nftapp.ui.theme.NFTAppTheme
import navigation.Screens
@Composable
fun NftCards(image : Int, name: String, likes: Int){

    Card(
        modifier = Modifier
            .height(height = 235.dp)
            .width(width = 200.dp)
            .padding(all = 8.dp),
        shape = RoundedCornerShape(size = 30.dp),
        elevation = 10.dp,
        backgroundColor = Color.White.copy(0.2f)

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(all = 10.dp)
                    .clip(RoundedCornerShape(size = 20.dp))
                    .size(size = 160.dp)
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = name,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = "❤️ $likes",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }}


//@Composable
//fun NFTCard(image: Int) {
//    Card(
//        modifier = Modifier
//            .height(height = 140.dp)
//            .width(width = 220.dp), shape = RoundedCornerShape(size = 30.dp)
//
//    )
//    {
//        Image(
//            painter = painterResource(id = image),
//            contentDescription = null,
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.Crop
//        )
//    }
//
//}

@Composable
fun MainScreen() {
    val image = painterResource(id = R.drawable.background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(
        horizontalAlignment = Alignment.Start, modifier = Modifier.verticalScroll(
            rememberScrollState()
        )
    ) {
        Spacer(modifier = Modifier.height(height = 30.dp))
        Text(
            text = "NFT Market Place",
            color = Color.White,
            fontSize = 30.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(height = 30.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(width = 20.dp))
            NftCards(image = R.drawable.art, name = "", likes = )
            Spacer(modifier = Modifier.width(width = 20.dp))
            NftCards(image = R.drawable.m)
            Spacer(modifier = Modifier.width(width = 20.dp))
            NftCards(image = R.drawable.vr)
            Spacer(modifier = Modifier.width(width = 20.dp))
        }

        Spacer(modifier = Modifier.height(height = 40.dp))
        Text(
            text = "Trending Collections",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(height = 40.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(width = 20.dp))


            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {

                NftCards(image = R.drawable.nft4)

                Row() {
                    Text(
                        text = "3D Art",
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp),
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(text = "200", modifier = Modifier.padding(start = 50.dp, top = 10.dp))
                }

            }

            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft2)
                Row() {

                    Text(
                        text = "Portrait Art",
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp)
                    )
                    Text(text = "140", modifier = Modifier.padding(start = 50.dp, top = 10.dp))

                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft1)
                Row() {
                    Text(
                        text = "Abstract#1",
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp)
                    )
                    Text(text = "130", modifier = Modifier.padding(start = 50.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
        }

        Spacer(modifier = Modifier.height(height = 40.dp))
        Text(
            text = "Top Sellers",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(height = 40.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft3)
                Row() {
                    Text(text = "Phoenix", modifier = Modifier.padding(top = 10.dp, start = 5.dp))
                    Text(text = "130", modifier = Modifier.padding(start = 50.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft5)
                Row() {
                    Text(text = "Alien", modifier = Modifier.padding(top = 10.dp, start = 10.dp))
                    Text(text = "130", modifier = Modifier.padding(start = 70.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft6)
                Row() {
                    Text(
                        text = "Marshmallow",
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp)
                    )
                    Text(text = "130", modifier = Modifier.padding(start = 30.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
        }


        Spacer(modifier = Modifier.height(height = 40.dp))
        Text(
            text = "Best of All Times",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(height = 40.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft7)
                Row() {
                    Text(text = "Ridges", modifier = Modifier.padding(top = 10.dp, start = 5.dp))
                    Text(text = "130", modifier = Modifier.padding(start = 50.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft8)
                Row() {
                    Text(text = "Dark", modifier = Modifier.padding(top = 10.dp, start = 10.dp))
                    Text(text = "130", modifier = Modifier.padding(start = 70.dp, top = 10.dp))

                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .background(Color.White.copy(0.2f), shape = RoundedCornerShape(30.dp))
                    .padding(12.dp)
            ) {
                NftCards(image = R.drawable.nft1)
                Row() {
                    Text(
                        text = "Abstract#1",
                        modifier = Modifier.padding(top = 10.dp, start = 5.dp)
                    )
                    Text(text = "130", modifier = Modifier.padding(start = 50.dp, top = 10.dp))
                }
            }
            Spacer(modifier = Modifier.width(width = 20.dp))
        }
        Spacer(modifier = Modifier.height(height = 40.dp))
    }
}

@Composable
fun SecondScreen() {
    Scaffold(bottomBar = {
        BottomAppBar(modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .graphicsLayer {
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp);clip = true
            }, backgroundColor = Color(0xFF4b4187)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }) {

    }
}