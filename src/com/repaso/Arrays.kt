package com.repaso

fun main (args: Array<String>){
    stringArrays()
    mixList()
    integerList()
    listOfList()
    arrayFromList()
    listFromArray()
    dinamicList()
}

fun stringArrays(){
    println("Manejando una array de cadenas")
    val array = arrayOf("hola","adios")
    array[1]= "adios!" //esto cambia el elemento que esta en la posicion 1 de la array
    println(array.contentToString())
    //println(array.toString()) //compila pero imprime el puntero en vez de el contenido de la array
}

fun integerList(){
    println("manejando una lista de int")
    val list = mutableListOf(1,2,3)
    list.add(4)
    print(list.toString())
}

fun mixList(){
    println("Manejando una lista mixta")
    val list = mutableListOf(1,2,"a",2.1) //crea la lista con elementos diferentes
    list.add(4)
    println(list.toString())
}

fun listOfList(){
    println("\n Manejando una lista de listas")
    val list1 = mutableListOf(1,2,"a",2.1)
    val list2 = mutableListOf(3,5)
    val array = arrayOf("hola","adios")
    val list = mutableListOf(list1,list2,"tres",array)
    list.add("uwu")
    println(list.toString())
}

fun arrayFromList(){
    println("Crear una array a partir de una lista")
    val list = mutableListOf(1,2,3)
    val array = list.toIntArray()
    println(array.contentToString())
}

fun listFromArray(){
    println("Crear una lista a partir de una array")
    val array = arrayOf(1,2,3,4,5,6)
    val list= array.asList()
    println(list.toString())
}

fun dinamicList(){//Si la posicion dividida entre 2 es 0 dicha posicion la multiplica por -1 y si no la imprime en positivo
    println("Creando una lista dinamica")
    val list = MutableList(99){ pos ->
        if (pos % 2 == 0) pos * -1 else pos
    }
    println(list.toString())
}

