fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

   println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    //llamamos a la funcion avarageNumbers
    val numbers = intArrayOf(1,2,3,4,5)
    println("El promedio de los numeros es: ${averageNumbers(numbers, 2)}")

    //llamada a la funcion evaluate
    println("${evaluate('+')}")

    //llamadas Lambd1
    saludo()
    //llamadas Lambd2 suma
    //llamadas Lambd2 suma resultado 1
    println(result)

    //llamadas Lambd2 suma resultado 1
    println(plus(1, 2, 3))

    //otra forma de lambda
    println({ a: Int, b: Int, c: Int -> a+b+c}(8, 2, 3))


    var n: Int = readLine()?.toInt() as Int
    //rangos con lambda
    println(calculateNumber(n))

}

fun evaluate(character: Char = '=', number: Int = 2): String{
return "${number} es ${character}"
}

fun averageNumbers(numbers: IntArray, n:Int): Int{
    //val numbers = intArrayOf(1,2,3,4,5)
    var sum = 0
    for (num in numbers){
        sum += num
    }

    return (sum / numbers.size)+n
}

//lambdas
val saludo = {println("Hola mundo")}

//var suma = {instrucciones -> sentencias}

val plus = {a: Int, b:Int, c: Int -> a+b+c}
val result = plus(3, 4, 5)

val calculateNumber = {n: Int->
    when(n){
        in 0..3 -> println("si esta entre 1 y 3")
        in 4..7 -> println("si esta entre 4 y 7")
        in 8..10 -> println("si esta entre 8 y 10")

    }

}

