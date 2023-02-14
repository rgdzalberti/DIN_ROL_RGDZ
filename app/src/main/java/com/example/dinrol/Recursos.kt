import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dinrol.systemBarColor
import viliApp.Destinations

data class Screen(
    val texto: String,
    val imagen: String,
    val boton1: Pair<String,String>, //Primero el texto y luego el destination
    val boton2: Pair<String,String>,
    val boton3: Pair<String,String>,
)

@Composable
fun BotonTemplate(navController: NavController ,texto: String = "",ruta: String = ""){

    Button(
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(1f)
            .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp),
        onClick = {
            //Aquí compruebo si el destino es otra ruta, una victoria o una derrota
            when{
                ruta.contains("DERROTA") -> {
                    endingCode.value = 2
                }
                ruta.contains("VICTORIA") -> {
                    endingCode.value = 1
                }
                else -> {navController.navigate(ruta)}
            }
                  },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {
        Text(text = texto, color = Color.Black, textAlign = TextAlign.Center)
    }

}

@Composable
fun BotonEjemplo(){
    BotonTemplate(rememberNavController(), "EJEMPLO", Destinations.Pantalla1.ruta)
}

var endingCode = mutableStateOf(0)

@Composable
fun WinScreen(navController: NavController,text: String){

    var appear by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { appear = true }

    AnimatedVisibility(
        visible = appear,
        enter = slideInVertically(
            initialOffsetY = {fullHeight -> -fullHeight},
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        ),
        exit = fadeOut()
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color(0xFF33b864))) {

            systemBarColor(color = Color(0xFF33b864))

            Button(modifier = Modifier
                .fillMaxSize()
                .alpha(0f), onClick = {}) {}

            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {


                Column(
                    Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "¡Victoria!", color = Color.White, fontSize = 30.sp, modifier = Modifier.padding(top = 10.dp))}

                Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = text, color = Color.White, fontSize = 25.sp, textAlign = TextAlign.Center)
                }

                Column(
                    Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min).padding(5.dp)) {
                    Button(modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, false)
                        ,onClick = { navController.navigate(Destinations.Pantalla1.ruta) ; endingCode.value = 0},
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF207A41))) {
                        Text(text = "Volver a jugar", color = Color.White)
                    }
                }

            }

        }
    }
}

@Preview
@Composable
fun PreviewDefeat(){
    DefeatScreen(rememberNavController(),"a")
}

@Composable
fun DefeatScreen(navController: NavController,text: String){

    var appear by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { appear = true }

    AnimatedVisibility(
        visible = appear,
        enter = slideInVertically(
            initialOffsetY = {fullHeight -> -fullHeight},
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        ),
        exit = fadeOut()
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color(0xFFD0312D))) {

            systemBarColor(color = Color(0xFFD0312D))

            Button(modifier = Modifier
                .fillMaxSize()
                .alpha(0f), onClick = {}) {}

            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {


            Column(
                Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "¡Derrota!", color = Color.White, fontSize = 30.sp, modifier = Modifier.padding(top = 10.dp))}
                
                Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = text, color = Color.White, fontSize = 25.sp, textAlign = TextAlign.Center)
                }

            Column(
                Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .padding(5.dp)
            ) {
                Button(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, false)
                    ,onClick = { navController.navigate(Destinations.Pantalla1.ruta); endingCode.value = 0 },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF921F1C))) {
                    Text(text = "Volver a jugar", color = Color.White)
                }
            }

            }
            
        }
    }
}

