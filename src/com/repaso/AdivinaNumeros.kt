package com.repaso

fun main(args: Array<String>){
    val resul = 8
    var numero:Int
    println("Encuentra un numero del 0 al 9")

    do{
        println("Escribe tu numero: ")
        numero = readLine()?.toInt() as Int

        if (numero<resul) println("El numero buscado es mas grande")
        if (numero>resul) println("El numero buscado es mas pequeño")

    }while (numero!=resul)

    if (numero==resul) println("Enhorabuena!El numero era $resul")

}
