package navigation

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nftapp.HomePageWithImage
import com.example.nftapp.HomePageWithText
import com.example.nftapp.ui.theme.NFTAppTheme

@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController =navController , startDestination =Screens.MainScreen.route ){
        composable(route = Screens.HomepageWithImage.route){
            HomePageWithImage(s1 = stringResource(id = R.string.s1), s2 = stringResource(id = R.string.s2), s3 = stringResource(id = R.string.s3), navController = navController)
        }
        composable(route = Screens.)

    }
}




















