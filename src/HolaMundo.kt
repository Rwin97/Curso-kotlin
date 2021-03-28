fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)
    println("\n")

    val m = -2
    val n = m.unaryMinus()
    println("n:$n")
        // se convierte el dato a positivo, siguiendo la regla de signos - * - = +

    var c = true
    var d = c.not()
    println("d:$d")
    //al utilizar datos logicos, la funcion not() no sera la unica que podemos usar, tenemos otras opciones

    val a = -12
    val b = 12

    println("a es mayor que b. ${a>b}")

}