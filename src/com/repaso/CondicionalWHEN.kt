package com.repaso

fun main (args: Array<String>){
    var numero: Int

    do{
        println("Introduce un numero: ")
        numero= readLine()?.toInt() as Int //leer datos por teclado

        //Condicional WHEN{

        //Es el condicional que equivale al switch de java
        when (numero){
            0 -> println("$numero es igual a 0")
            in 1..99 -> println("$numero es un numero comprendido entre 0 y 99")
            100,101 -> println("$numero es 100 o 101")
            in 102..200 -> println("$numero es mayor de 101")
        }
        //}
    }while (numero>0)

}