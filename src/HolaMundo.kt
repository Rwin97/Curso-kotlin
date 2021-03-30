fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

    var x = 5
    println("X es igual a 5? ${x==5}")

    var mensaje = "El alor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")
    //linea anterior mensaje replace y expresion y valor

}