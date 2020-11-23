package com.repaso

fun main (args: Array<String>){
    //PROPIEDADES DE LAS VARIABLES

    //kotlin es capaz de inferir el tipo de una variable, es decir no es necesario indicar de que tipo es la variable
    var variable = 1

    //Aunque tambien se puede forzar a que utilice un tipo a tu eleccion.
    var variable2 : Long = 10 //Esta variable serai de tipo long

    //Las variables tienen un tipo asignado y este no se puede cambiar
    //variable2 = variable //Esto no compila

    //Pero es posible asignar una variable de un tipo a otra de otro tipo utilizando castings
    variable2 = variable.toLong()
    println("variable2 vale $variable2")

    println("La suma de la variable y la variable2 es... ${variable+variable2}")

    //Es posible comprobar el tipo al que pertenece una variable
    if (variable is Int) println("Es un int") else println("No es un int")

    //Por defecto, las variables no pueden ser null
    //val variable3 : Int = null //No compila

    //Kotlin exige el operador ? para que una variable pueda tomar el valor null
    var variable3 : Int? = null

    // variable3.toLong() // No compila ya que toLong requiere que variable3 sea no null.
    avoidNullExceptionIfNumeroIsNull(variable3)
    forceNullExceptionIfNumeroIsNull(variable3)

    // variable 4 es de tipo Int
    var variable4 = getInt(variable3)
    println(variable4)
}
fun getInt(numero : Int?) : Int{
    return numero?: 0
}

fun avoidNullExceptionIfNumeroIsNull(numero : Int?){
    println("Es numero recibido es... ${numero?.toLong()}")
    // toLong() no se ejecuta si numero es null que
}

fun forceNullExceptionIfNumeroIsNull(numero : Int?){
    try {
        print("Es numero recibido es... ${numero!!.toLong()}")
    } catch (exception : NullPointerException) {
        println("Excepción capturada")
    }
}