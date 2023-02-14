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
            imagen = "https://tribekaretail.com/wp-content/uploads/2020/07/como-disenar-el-escaparate-y-la-fachada-de-tu-tienda-de-moda-parfois-completa.jpg",
            boton1 = Pair("No me distraigo y me dirijo al instituto", Destinations.Screen2_1.ruta),
            boton2 = Pair("Entro con sigilo a ver que está ocurriendo", Destinations.Screen2_2.ruta),
            boton3 = Pair("Alertas a las autoridades", Destinations.Screen2_3.ruta)))
}

@Composable
fun Screen2_1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Llegas al instituto a tiempo para el examen de Mario. La pregunta es la siguiente ¿Qué es lo más importante en un programa?",
            imagen = "https://images.ecestaticos.com/elX4lEynsj-sSkaQjKArK1T4nHM=/67x0:2638x1806/992x700/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F4d6%2F1cb%2F5b7%2F4d61cb5b72939a8359978792a5280e46.jpg",
            boton1 = Pair("Que sea velóz", "DERROTA:Te equivocas en la pregunta más fácil y suspendes el examen, nunca debiste haberte apuntado a este grado"),
            boton2 = Pair("Que sea robusto", "VICTORIA:¡CORRECTISIMO! EN ESTA VIDA SI NO ERES ROBUSTO NO ERES NADA"),
            boton3 = Pair("Que esté actualizado", "DERROTA:Te equivocas en la pregunta más fácil y suspendes el examen, nunca debiste haberte apuntado a este grado")))
}

@Composable
fun Screen2_2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Un hurto se está cometiendo. Un ladrón con escopeta apunta hacía el vendedor",
            imagen = "https://cdn.jwplayer.com/v2/media/2DwSI5Jj/poster.jpg?width=720",
            boton1 = Pair("Trato de convencerle para que pare", "DERROTA:El ladrón no está de buen humor así que sin miramientos te dispara 7 veces"),
            boton2 = Pair("Le doy una colleja", "DERROTA:Le das el collejón del siglo. Al ladrón le duele el cogote pero tu yaces muerto en el suelo tras soltar una última carcajada"),
            boton3 = Pair("Accionas la palanca próxima a tí", "VICTORIA:Casualmente el ladrón se posicionaba estratégicamente sobre una trampilla que daba lugar al centro de la Tierra. El ladrón muere y te vas a clase.")))
}

@Composable
fun Screen2_3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Las autoridades detienen al ladrón y como premio te dejan tirar una ruleta ",
            imagen = "https://d2d22nphq0yz8t.cloudfront.net/d9ae9b19-cf1e-4d26-9118-d8a16b01a573/https://www.888casino.es/blog/sites/newblog.888casino.es/files/styles/hp_headline_big/public/2022-04/estrategiasportadao.jpg?itok=1VvBfP73/mxw_1170,f_auto",
            boton1 = Pair("No sale nada", "DERROTA:No sale nada y estas muy triste, no vas a clase y por tanto malgastas el día"),
            boton2 = Pair("La carcel", "DERROTA:Sale la carcel, permaneces bajo vigilancia 300 días"),
            boton3 = Pair("Te toca la bonoloto", "VICTORIA:Ganas tanto dinero que decides no volver a clase nunca más")))
}

@Composable
fun Screen3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Te diriges al parque y al llegar ves varios lugares de interés",
            imagen = "https://drupal.gijon.es/sites/default/files/2019-02/gijon_parques_isabel_lacatolica_patos_roberto_egea_acebal.jpg",
            boton1 = Pair("La mesa de picnic", Destinations.Screen3_1.ruta),
            boton2 = Pair("El bar", Destinations.Screen3_2.ruta),
            boton3 = Pair("La ausencia de matería, el vacío", Destinations.Screen3_3.ruta)))
}

@Composable
fun Screen3_1(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Estas tan agusto en la mesa que decides tomarte un tentenpie",
            imagen = "https://www.agrobroker.es/wp-content/uploads/2014/03/130005-mesa-picnic-extra.jpg",
            boton1 = Pair("Me tomo un batido de leche chocolatastico", "DERROTA:Desarrollas intolerancia a la lactosa y sufres de las consecuencias intestinales"),
            boton2 = Pair("Como un huevo duro de mi cacerola", "VICTORIA:Comida de deportistas, +5 en una vida sana"),
            boton3 = Pair("Me tomo un Vozka de las Maldivas", "DERROTA:Coma etilico, demasiado fantasioso para un picnic")))
}

@Composable
fun Screen3_2(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Entras al bar y coges asiento",
            imagen = "https://i.pinimg.com/originals/e1/98/63/e198637c5ea75820396757078c26ad9d.jpg",
            boton1 = Pair("Pagas una ronda para todo el mundo", "VICTORIA:Todo el mundo baila y canta. A veces no hace falta más"),
            boton2 = Pair("Activo el botón de debajo de la mesa", "DERROTA:Activaste el botón de perder la partida"),
            boton3 = Pair("Charlas durante horas con el de al lado", "DERROTA:Es Lunes por la tarde y tienes clase, no deberías de haber venido en un principio")))
}

@Composable
fun Screen3_3(navController: NavController){
    TemplateScreen(
        navController,
        screen = Screen("Miras al infinito y el infinito te devuelve la mirada",
            imagen = "https://staticg.sportskeeda.com/editor/2021/11/b2c66-16367379323697-1920.jpg",
            boton1 = Pair("Haces finito al infinito", "DERROTA:Tampoco te pases de listo"),
            boton2 = Pair("Rapidamente aparto la mirada", "DERROTA:Tu débil condición enfadó a los Dioses, sufres de dolor de cabeza"),
            boton3 = Pair("Miras a través de él", "VICTORIA:Ves el origen del universo y te haces uno con el conocimiento. Trasciendes lo físico.")))
}