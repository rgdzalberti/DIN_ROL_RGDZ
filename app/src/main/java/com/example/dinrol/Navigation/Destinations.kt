package viliApp

sealed class Destinations (val ruta : String) {

    object Pantalla1: Destinations("MainScreen")
    object Screen1: Destinations("Screen1")
    object Screen2: Destinations("Screen2")
    object Screen2_1: Destinations("Screen2_1")
    object Screen2_2: Destinations("Screen2_2")
    object Screen2_3: Destinations("Screen2_3")
    object Screen3: Destinations("Screen3")
    object Screen3_1: Destinations("Screen3_1")
    object Screen3_2: Destinations("Screen3_2")
    object Screen3_3: Destinations("Screen3_3")


}