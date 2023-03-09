package navigation

sealed class Screens(val route : String){
    object HomepageWithImage : Screens("HomePageWithImage")
    object MainScreen : Screens("MainScreen")
}
