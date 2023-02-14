package viliApp

import MainScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import Screen1
import Screen2
import Screen2_1
import Screen2_2
import Screen2_3
import Screen3
import Screen3_1
import Screen3_2
import Screen3_3

@Composable
fun NavigationHost (navController: NavHostController,startDestination: String){
    NavHost(
        navController = navController,
        startDestination = startDestination )
    {
        composable(Destinations.Pantalla1.ruta){
           MainScreen(navController)
        }

        composable(Destinations.Screen1.ruta){
            Screen1(navController = navController)
        }

        composable(Destinations.Screen2.ruta){
            Screen2(navController = navController)
        }

        composable(Destinations.Screen2_1.ruta){
            Screen2_1(navController = navController)
        }

        composable(Destinations.Screen2_2.ruta){
            Screen2_2(navController = navController)
        }

        composable(Destinations.Screen2_3.ruta){
            Screen2_3(navController = navController)
        }

        composable(Destinations.Screen3.ruta){
            Screen3(navController = navController)
        }

        composable(Destinations.Screen3_1.ruta){
            Screen3_1(navController = navController)
        }

        composable(Destinations.Screen3_2.ruta){
            Screen3_2(navController = navController)
        }

        composable(Destinations.Screen3_3.ruta){
            Screen3_3(navController = navController)
        }

    }
}









