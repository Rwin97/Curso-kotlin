fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

    var a = 5
    var b: Long = a.toLong()
    println(b)

    val nombre = args[0].toInt()
    val c = a.plus(nombre)
    println(c)

    //Rangos

    val oneToHumdred = 1..5
    for (i in oneToHumdred){
        println(i)
    }

    //val aToC = 'a'..'c'
    for (i in 'a'..'c'){
        println(i)
    }

    //sentecia if es un operador logico booleano es decir devuelve true o false
    val num1 = 10
    if (num1.equals(2)){
        println("si son iguales")
    }else{
        println("no, no son iguales")
    }

    // when es equivalente a switch
    when(num1){
        in 1..5 -> println("si esta entre 1 y 5")
        in 1..3 -> println("si esta entre 1 y tres")
        !in 5..10 -> println("No, no esta entre 5 y 10")
        else -> println("no esta en ninguno de los anteriores")

    }

    //bucles
    var cont = 1
    //
    while (cont < 1){
        println("mensaje: $cont")
        cont++
    }

    do {
        println("mensaje do while: $cont")
        cont++
    }while (cont < 1)
}