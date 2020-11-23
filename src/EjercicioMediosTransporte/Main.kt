package EjercicioMediosTransporte

import kotlin.random.Random //esta libreria nos permite generar numeros aleatorios

fun main (){

    val bus1 = Bus()
    val bus2 = Bus()
    val barco1 = Barco()
    val barco2 = Barco()
    val flotaDeLaEmpresa = listOf(bus1,bus2,barco1,barco2) //esto es una lista con todos los elementos que hemos creado

    for (MedioDeTransporte in flotaDeLaEmpresa){
        MedioDeTransporte.transladarse("Barcelona","Ibiza")
    }

    abstract class MedioDeTransporte(){ //creamos una clase abstracta que contenga una funcion
        abstract fun transladarse(origen: String, destino: String)

        protected fun llegarADestino(){
            println("Llegar a destino...")
        }

        protected fun iniciarRuta(){
            println("Inicio de la ruta...")
        }
    }

    class Bus : MedioDeTransporte(){
        override fun transladarse(origen: String, destino: String) {
            println("Comienza un translado en bus")

            if (comprobarEstadoCarreteras(origen,destino)){
                iniciarRuta()
                hacerDescanso()
                llegarADestino()
            } else {
                println("Cancelamos la ruta por baches")
            }
        }

        private fun hacerDescanso(){
            println("A descanso")
        }

        fun comprobarEstadoCarreteras(origen: String, destino: String) : Boolean { //esta funcion crea un booleano de forma aleatoria
            return Random.nextBoolean()
        }

    }

    class Barco : MedioDeTransporte(){
        override fun transladarse(origen: String, destino: String) {
            println("Comienza el translado de un barco")
            comprobarMeteo(origen,destino)
            if (comprobarMeteo(origen,destino) > 90){
                println("No zarpamos")
            } else {
                iniciarRuta()
                llegarADestino()
            }
        }

        fun comprobarMeteo(origen: String,destino: String) : Int{
            return Random.nextInt(100)
        }
    }

}


