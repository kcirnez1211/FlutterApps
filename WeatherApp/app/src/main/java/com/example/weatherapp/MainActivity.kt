package com.example.weatherapp

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FirstPage()
                }
            }
        }
    }
}

@Composable
fun WeatherCard() {
    Card(
        modifier = Modifier
            .height(height = 340.dp)
            .width(width = 390.dp)
            .padding(10.dp),

        elevation = 4.dp,
        backgroundColor = Color.Transparent,
    ) {
        Column() {
            Row() {
                Text(
                    text = "Real feel", modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                    fontSize = 20.sp, color = Color.Black
                )
                Text(
                    text = "Humidity", modifier = Modifier.padding(start = 150.dp, top = 20.dp),
                    fontSize = 20.sp, color = Color.Black
                )
            }
            Row() {
                Text(
                    text = "22'C", modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                    fontSize = 25.sp, color = Color.Black
                )
                Text(
                    text = "90%", modifier = Modifier.padding(start = 180.dp, top = 10.dp),
                    fontSize = 25.sp, color = Color.Black
                )
            }
            Row() {
                Text(
                    text = "Chance of Rain", modifier = Modifier.padding(start = 20.dp, top = 30.dp),
                    fontSize = 20.sp, color = Color.Black
                )
                Text(
                    text = "Pressure", modifier = Modifier.padding(start = 90.dp, top = 30.dp),
                    fontSize = 20.sp, color = Color.Black
                )
            }
            Row() {
                Text(
                    text = "84%", modifier = Modifier.padding(start = 20.dp, top = 8.dp),
                    fontSize = 25.sp, color = Color.Black
                )
                Text(
                    text = "1007mbar", modifier = Modifier.padding(start = 170.dp, top = 10.dp),
                    fontSize = 25.sp, color = Color.Black
                )
            }
            Row() {
                Text(
                    text = "Wind Speed", modifier = Modifier.padding(start = 20.dp, top = 40.dp),
                    fontSize = 20.sp, color = Color.Black
                )
                Text(
                    text = "UV Index", modifier = Modifier.padding(start = 120.dp, top = 40.dp),
                    fontSize = 20.sp, color = Color.Black
                )
            }
            Row() {
                Text(
                    text = "14.3Km/h", modifier = Modifier.padding(start = 20.dp, top = 10.dp),
                    fontSize = 25.sp, color = Color.Black
                )
                Text(
                    text = "0", modifier = Modifier.padding(start = 120.dp, top = 10.dp),
                    fontSize = 25.sp, color = Color.Black
                )
            }
        }
    }
}

@Composable
fun RowText(s1: String, t1:String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 40.dp, top = 20.dp),
    ) {
        Text(
            color = Color.White,
            text = s1,
            fontSize = 15.sp,
        )
        Text(
            color = Color.White,
            text = t1,
            fontSize = 15.sp,
        )
    }
}

@Composable
fun HourReport() {
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

        RowText(s1 = "Now", t1 = "22'", )
        RowText(s1 = "23:00", t1 = "22'")
        RowText(s1= "1:10",t1= "22'")
        RowText(s1 = "01:00", t1 = "22'",)
        RowText(s1= "02:00", t1 = "22'")
        RowText(s1= "03:00", t1 = "22'")
        RowText(s1= "04:00", t1 = "22'")
        RowText(s1= "05:00", t1 = "22'")
        RowText(s1= "06:00", t1 = "20'")
        RowText(s1= "07:00", t1 = "21'")
        RowText(s1= "08:00", t1 = "21'")
        RowText(s1= "09:00", t1 = "22'")
        RowText(s1= "10:00", t1 = "22'")
        RowText(s1= "11:00", t1 = "23'")
        RowText(s1= "12:00", t1 = "23'")
        RowText(s1= "13:00", t1 = "25'")
        RowText(s1= "14:00", t1 = "26'")
        RowText(s1= "15:00", t1 = "27'")
        RowText(s1= "16:00", t1 = "27'")
        RowText(s1= "17:00", t1 = "26'")
        RowText(s1= "18:00", t1 = "26'")
        RowText(s1= "19:00", t1 = "24'")
        RowText(s1= "20:00", t1 = "23'")
        RowText(s1= "21:00", t1 = "22'")
        RowText(s1= "22:00", t1 = "22'")
        Spacer(modifier = Modifier.width(40.dp) )
    }
}

@Composable
fun FirstPage() {
    //Background image--------------------------------------------------------------------------------------------------------------
    val image = painterResource(id = R.drawable.istockphoto_536559095_612x612)
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
        //Hubli-Dharwad----------------------------------------------------------------------------------------------------------------
        Text(
            text = "Hubli-Dharwad",
            color = Color.White,
            modifier = Modifier.padding(start = 130.dp, top = 30.dp),
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(height = 10.dp))
        //Turn Notification on button--------------------------------------------------------------------------------------------------
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 100.dp, top = 5.dp),
            shape = RoundedCornerShape(size = 30.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.White)
        ) {
            Text(
                text = "Turn on location services",
                fontSize = 12.sp,
                fontWeight = FontWeight.ExtraBold,

                )
        }
        //Temperature 25-----------------------------------------------------------------------------------------------------------
        Row() {
            Text(
                text = "25",
                color = Color.White,
                modifier = Modifier.padding(start = 110.dp, top = 0.dp),
                fontSize = 150.sp
            )
            Spacer(modifier = Modifier.width(width = 10.dp))
            Text(
                text = "o",
                color = Color.White,
                modifier = Modifier.padding(start = 0.dp, top = 25.dp),
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.width(width = 10.dp))
            Text(
                text = "C",
                color = Color.White,
                modifier = Modifier.padding(start = 0.dp, top = 25.dp),
                fontSize = 30.sp
            )

        }
        //Cloudy Text-------------------------------------------------------------------------------------------
        Text(
            text = "Cloudy",
            color = Color.White,
            modifier = Modifier.padding(start = 150.dp, top = 0.dp),
            fontSize = 30.sp
        )
        //AQI button ---------------------------------------------------------------------------------------------------
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 150.dp, top = 5.dp),
            shape = RoundedCornerShape(size = 30.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.White)
        ) {
            Text(
                text = "AQI 13",
                fontSize = 15.sp,
                fontWeight = FontWeight.ExtraBold,

                )
        }
        //Today Light Rain starts------------------------------------------------------------------------------------------
        Row() {
            Icon(imageVector = Icons.Default.Cloud, contentDescription = null, modifier = Modifier.padding(top = (40.dp), start = 30.dp))
            Text(

                text = "Today-Light rain",
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp, top = 40.dp),
                fontSize = 20.sp
            )
            Text(
                text = "26/21",
                color = Color.White,
                modifier = Modifier.padding(start = 85.dp, top = 40.dp),
                fontSize = 20.sp
            )
        }
        Row() {
            Icon(imageVector = Icons.Default.WbSunny, contentDescription = null, modifier = Modifier.padding(top = (40.dp), start = 30.dp))
            Text(
                text = "Tomorrow-Sunny",
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp, top = 40.dp),
                fontSize = 20.sp
            )
            Text(
                text = "27/20",
                color = Color.White,
                modifier = Modifier.padding(start = 80.dp, top = 40.dp),
                fontSize = 20.sp
            )
        }
        Row() {
            Icon(imageVector = Icons.Default.Umbrella, contentDescription = null, modifier = Modifier.padding(top = (40.dp), start = 30.dp))
            Text(
                text = "Sun-Thunderstorm",
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp, top = 40.dp),
                fontSize = 20.sp
            )
            Text(
                text = "28/20",
                color = Color.White,
                modifier = Modifier.padding(start = 70.dp, top = 40.dp),
                fontSize = 20.sp
            )
        }
        //5 day forecast button ---------------------------------------------------------------------------------------
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(start = 100.dp, top = 30.dp),
            shape = RoundedCornerShape(size = 30.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent,
                contentColor = Color.White)
        ) {
            Text(
                text = "5-day forecast",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,

                )
        }

        Spacer(modifier = Modifier.height(height = 30.dp))
        //24 hr starts-------------------------------------------------------------------------------------------------------------------------

        HourReport()
// Real feel part starts----------------------------------------------------------------------------------------------
        Spacer(modifier = Modifier.height(40.dp))
        WeatherCard()


        Spacer(modifier = Modifier.height(40.dp))







    }

}


