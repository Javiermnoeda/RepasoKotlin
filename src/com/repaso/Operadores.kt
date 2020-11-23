package com.repaso

import java.lang.ClassCastException

fun main (args: Array<String>){
    operatorIs()
    operatorAs()
}

fun operatorIs(){
    println("----OperatorIs---")

    val myInteger = 10
    println("myInteger es un integer y divido entre 2 es ${myInteger.div(2)}")
    if (myInteger is Int){
        println("Ve al primer if")
    }

    val myNumber: Number= myInteger
    // La siguiente línea no compilaría ya que Number no tiene el metodo div
    //println("myNumber is a Number and split by 2 is ${myNumber.div(2)}")

    if (myNumber is Int) {
        println("myNumber es un integer y dividido entre dos es ${myNumber.div(2)}")
    }

    if (myNumber !is Int){
        println("Esto no deberia de ser llamado")
    }
}

fun operatorAs(){
    println("--- OperatorAs ---")

    //Casting con Long
    val myLong = 160
    println("myInteger es un Int y dividido entre 2 es ${myLong.div(2)}")
    val myNumber1 : Number = myLong
    myNumber1 as Int
    println("myNumber1 es un Long y dividido entre 2 es ${myNumber1.div(2)}")

    //casting con Float
    val myFloat = 2.2
    println("myFloat es un float y divido entre 2 es ${myFloat.div(2)}")

    //casting con String
    val myString="Hola"
    println("myString es $myString")

    //El operador as lanzaria una excepcion ClassCastException ya que un String no se puede transformar en un Int de este modo
    try{
        val myNumber4 = myString as Int
    }catch (esception : ClassCastException){
        println("Excepcion capturada")
    }

    //con as?, en caso de que no pueda realizarse el casting, entonces devuelve null
    val myNumber4 = myString as? Int
    println("myNumber4 is $myNumber4")
}