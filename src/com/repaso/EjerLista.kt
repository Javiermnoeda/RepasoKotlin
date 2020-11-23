package com.repaso

fun main (args: Array<String>){
 val lista = crearLista()
    var contenidoString = " "
    var suma = 0.0

    //for each es que va a analizar cada elemento de la lista
    lista.forEach(){
        when(it){
            is String -> contenidoString +="$it"
            is Double -> suma += it
            is Int -> suma += it
        }

    }

    println("La lista contiene $lista")
    println(contenidoString)
    println("La suma de todos los numeros es $suma")
}

fun crearLista(): List<Any>{
    return listOf("Hola",' ',2,3,"¿",0.1,"que",1,"tal",0.9,"?")
}