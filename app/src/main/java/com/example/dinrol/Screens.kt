import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dinrol.TemplateScreen
import viliApp.Destinations

@Composable
fun Screen1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Empieza un nuevo día. ¿Hacia donde te diriges?",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("Instituto", Destinations.Screen2.ruta),
            boton2 = Pair("Parque", Destinations.Screen3.ruta),
            boton3 = Pair("Al centro de la Tierra", "DERROTA:Mueres calcinado por la lava y la falta de dióxido de carbono.")))
}

@Composable
fun Screen2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("2",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("2_1", Destinations.Screen2_1.ruta),
            boton2 = Pair("2_2", Destinations.Screen2_2.ruta),
            boton3 = Pair("2_3", Destinations.Screen2_3.ruta)))
}

@Composable
fun Screen2_1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("2_1",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("D", "DERROTA:"),
            boton2 = Pair("V", "VICTORIA:"),
            boton3 = Pair("D", "DERROTA:")))
}

@Composable
fun Screen2_2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("2_2",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("D", "DERROTA:"),
            boton2 = Pair("D", "DERROTA:"),
            boton3 = Pair("V", "VICTORIA:")))
}

@Composable
fun Screen2_3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("2_3",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("D", "DERROTA:"),
            boton2 = Pair("D", "DERROTA:"),
            boton3 = Pair("V", "VICTORIA:")))
}

@Composable
fun Screen3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("3",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("3_1", Destinations.Screen3_1.ruta),
            boton2 = Pair("3_2", Destinations.Screen3_2.ruta),
            boton3 = Pair("3_3", Destinations.Screen3_3.ruta)))
}

@Composable
fun Screen3_1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("3_1",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("D", "DERROTA:"),
            boton2 = Pair("V", "VICTORIA:"),
            boton3 = Pair("D", "DERROTA:")))
}

@Composable
fun Screen3_2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("3_2",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("V", "VICTORIA:"),
            boton2 = Pair("D", "DERROTA:"),
            boton3 = Pair("D", "DERROTA:")))
}

@Composable
fun Screen3_3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("3_3",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("D", "DERROTA:"),
            boton2 = Pair("D", "DERROTA:"),
            boton3 = Pair("V", "VICTORIA:")))
}