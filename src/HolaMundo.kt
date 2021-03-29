const val N = "name" // variables que no se pueden reasignar pero que se mantien constantes variables globales
var n = "n" //mala practica por que la variable puede ser modificada en n funciones usar ene menor cantidad
val n2 = "n" // para variables asignadas de formas local para ser accesdidas en tiempo de ejecuacion
fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)
    println("\n")

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = args[0] //tiempo de ejcuacion
    //const tiempo de compilacion
    println(name)
    println(N)

}