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
        screen = Screen("Te dirijes hacia el instituto, aunque por el camino observas algo que parece raro dentro de una tienda",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("No me distraigo y me dirijo al instituto", Destinations.Screen2_1.ruta),
            boton2 = Pair("Entro con sigilo a ver que está ocurriendo", Destinations.Screen2_2.ruta),
            boton3 = Pair("2_3", Destinations.Screen2_3.ruta)))
}

@Composable
fun Screen2_1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Llegas al instituto a tiempo para el examen de Mario. La pregunta es la siguiente ¿Qué es lo más importante en un programa?",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("Que sea velóz", "DERROTA:Te equivocas en la pregunta más fácil y suspendes el examen, nunca debiste haberte apuntado a este grado"),
            boton2 = Pair("Que sea robusto", "VICTORIA:¡CORRECTISIMO! EN ESTA VIDA SI NO ERES ROBUSTO NO ERES NADA"),
            boton3 = Pair("Que esté actualizado", "DERROTA:Te equivocas en la pregunta más fácil y suspendes el examen, nunca debiste haberte apuntado a este grado")))
}

@Composable
fun Screen2_2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Un hurto se está cometiendo. Un ladrón con escopeta apunta hacía el vendedor",
            imagen = "https://actualidadlaboral.com.ve/admini/wp-content/uploads/desarrollo4-684x384.jpg",
            boton1 = Pair("Trato de convencerle para que pare", "DERROTA:El ladrón no está de buen humor así que sin miramientos te mete 7 tiros"),
            boton2 = Pair("Le doy una colleja", "DERROTA:Le das el collejón del siglo. Al ladrón le duele el cogote pero tu yaces muerto en el suelo tras soltar una última carcajada"),
            boton3 = Pair("Accionas la palanca próxima a tí", "VICTORIA:Casualmente el ladrón se posicionaba estratégicamente sobre una trampilla que daba lugar al centro de la Tierra. El ladrón muere y te vas a clase.")))
}

@Composable
fun Screen2_3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("2_3 EL INFINITO TE DEVUELVE LA MIRADA",
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