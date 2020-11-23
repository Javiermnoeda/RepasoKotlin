package com.repaso

fun main (args: Array<String>){

//llamamos a la funcion del bucle basico
    basicLoop(4) //dentro de los parentesis que van despues del nombre de la funcion irian el numero de veces que se repite el bucle (el valor de la variable repetitions)
    customLoop(2)


}

//Creamos una funcion con parametros para este bucle basico
fun basicLoop(repetitions: Int){
    println("=== Soy la funcion basicLoop ===")
    // Sería equivalente a for (int i := 0; i < repetitions; i++)
    repeat(repetitions){
        println("Estoy repitiendo este bucle por $it vez de un total de $repetitions")
    }
    //dentro del conexto repeat it es el contador
}

//Creamos una funcion con parametros para realizar un bucle personalizado
fun customLoop(repetitions: Int){
    println(" === Soy la funcion customLoop ===")
    repeat(repetitions){position ->
        println("Estoy repitiendo esto por $position vez de un total de $repetitions")
    }

}