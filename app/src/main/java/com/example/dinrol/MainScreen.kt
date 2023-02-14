import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dinrol.R
import com.example.dinrol.systemBarColor
import viliApp.Destinations

@Preview
@Composable
fun PreviewPantalla1(){
    MainScreen(rememberNavController())
}

@Composable
fun MainScreen(nav: NavController){

    systemBarColor(color = Color(0xFF0A0A0A))

    Box() {

        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFF0A0A0A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Duermes placidamente...", color = Color.White, fontSize = 30.sp)

            Spacer(modifier = Modifier.height(30.dp))

            //Imagen
            Image(painter = painterResource(id = R.drawable.sleeping), contentDescription = "")
            
            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { nav.navigate(Destinations.Screen1.ruta) }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
                Text(modifier = Modifier.fillMaxWidth(0.8f),text = "Despertar", color = Color.Black, textAlign = TextAlign.Center)
            }
        }

    }

}


