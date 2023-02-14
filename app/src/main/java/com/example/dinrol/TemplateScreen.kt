package com.example.dinrol

import BotonTemplate
import DefeatScreen
import Screen
import WinScreen
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import endingCode
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import viliApp.Destinations

@Preview
@Composable
fun PreviewTemplate(){
    TemplateScreen(rememberNavController(),
        screen = Screen("Hola texto de ejemplo mega texto de ejemplo texto de ejemplo texto de ejemplo texto de ejemplo"
            ,"https://developer.android.com/static/images/jetpack/compose/graphics-sourceimageland.jpg",
            Pair("Ejemplo",Destinations.Pantalla1.ruta),Pair("Ejemplo",Destinations.Pantalla1.ruta),Pair("Ejemplo",Destinations.Pantalla1.ruta)))
}

@Composable
fun TemplateScreen(nav: NavController, screen: Screen){

    systemBarColor(color = Color(0xFF0A0A0A))

    var startAnimation by remember { mutableStateOf(false) }
    //Cuando la pantalla carga le digo que lance las animaciones
    LaunchedEffect(Unit) { startAnimation = true }

    Box(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF0A0A0A)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        //Titulo
        androidx.compose.animation.AnimatedVisibility(
            visible = startAnimation,
            enter = slideInVertically(
                initialOffsetY = { fullHeight -> -fullHeight },
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            ),
            exit = fadeOut()
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier.padding(
                        top = 10.dp,
                        bottom = 10.dp,
                        start = 5.dp,
                        end = 5.dp
                    ),
                    text = screen.texto,
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        Column(
            Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)
                , horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        //Imagen, si está vacío es que no hay imagen
        if (screen.imagen != ""){
            Box(modifier = Modifier
                .fillMaxWidth(0.95f)
                .height(300.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White),
                contentAlignment = Alignment.Center
            ){

                CircularProgressIndicator(color = Color.Black)

                Image(contentScale = ContentScale.Crop, modifier = Modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxSize(),painter = rememberAsyncImagePainter(screen.imagen), contentDescription = "Image")
            }
        }

        //Botones
        Column(
            Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Min)) {
                Spacer(modifier = Modifier.height(10.dp))

            //BOTON 1
            androidx.compose.animation.AnimatedVisibility(
                visible = startAnimation,
                enter = slideInHorizontally (
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = fadeOut()
            ) {
                BotonTemplate(nav, screen.boton1.first, screen.boton1.second)
            }

            //BOTON 2
            androidx.compose.animation.AnimatedVisibility(
                visible = startAnimation,
                enter = slideInHorizontally (
                    initialOffsetX = { fullWidth -> fullWidth },
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = fadeOut()
            ) {
                BotonTemplate(nav, screen.boton2.first, screen.boton2.second)
            }

            //BOTON 3
            androidx.compose.animation.AnimatedVisibility(
                visible = startAnimation,
                enter = slideInHorizontally (
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
                exit = fadeOut()
            ) {
                BotonTemplate(nav, screen.boton3.first, screen.boton3.second)
            }

                Spacer(modifier = Modifier.height(10.dp))
            }
        }

    }

        when{
            endingCode.value == 1 -> {

                var message = ""

                    if (screen.boton1.second.contains("VICTORIA") || screen.boton1.second.contains("DERROTA")) {
                        message = screen.boton1.second.split(":")[1]
                    } else if (screen.boton2.second.contains("VICTORIA") || screen.boton2.second.contains("DERROTA"))
                    {
                        message = screen.boton2.second.split(":")[1]
                    } else if (screen.boton3.second.contains("VICTORIA") || screen.boton3.second.contains("DERROTA"))
                    {
                        message = screen.boton3.second.split(":")[1]
                    }

                WinScreen(nav, message)
            }
            endingCode.value == 2 -> {

                var message = ""

                if (screen.boton1.second.contains("VICTORIA") || screen.boton1.second.contains("DERROTA")) {
                    message = screen.boton1.second.split(":")[1]
                } else if (screen.boton2.second.contains("VICTORIA") || screen.boton2.second.contains("DERROTA"))
                {
                    message = screen.boton2.second.split(":")[1]
                } else if (screen.boton3.second.contains("VICTORIA") || screen.boton3.second.contains("DERROTA"))
                {
                    message = screen.boton3.second.split(":")[1]
                }

                DefeatScreen(nav, message)}
        }

    }

}