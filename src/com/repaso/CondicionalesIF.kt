package com.repaso

fun main (args: Array<String>){
    var numero: Int
    println("Introduce un numero: ")
    numero= readLine()?.toInt() as Int //leer datos por teclado

    //Condicionales IF {

        //condicional basico
        if (numero == 0) println("$numero es igual a 0")else println("$numero es diferente de 0")

        //En Kotlin tambien puede funcionar en base a rangos
        if (numero in 0..9) println("$numero es un numero comprendido entre 0 y 9")else println("$numero es mayor que 9")

    //}


}