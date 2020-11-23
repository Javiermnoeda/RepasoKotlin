package com.repaso

fun main (args: Array<String>){

    //Llamamos a la funcion sin parametros
   funWithoutParams()

    //Llamamos a la funcion con parametros. seria nombre_funcion(parametro)
    funWithParams(4)

}

//Creando una funcion sin parametros
fun funWithoutParams (){
    println("=== Soy la funcion sin parametros ===")
}

//Creando una funcion con parametros
fun funWithParams (number : Int){
    println("=== Soy la funcion con parametros ====")
    println("He recibido el numero $number")
}