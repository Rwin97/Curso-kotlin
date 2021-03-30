fun main(args: Array<String>) {
    println("Hola mundo desde platzi")
    //Array
    val countries = arrayOf("India", "Mexico", "Colombia", "Argentia", "Chile", "Peru")
    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")


    //promedio de los numeros del arreglo
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (num in numbers){
        println("Numbers: $num")
        sum += num

    }
    val avarage = sum / numbers.size
    println("Promedio: $avarage")

    var arrayObject: Array<Int> = arrayOf(5,6,7)
    var inPrimitive: IntArray = arrayObject.toIntArray()
    arrayObject = arrayObject.plus(2) //agregar un elemento a nuestro array

    val suma = arrayObject.sum()
    println("La suma de la array es: $suma")

    for(a in arrayObject){
        println("Array: $a")
    }

    arrayObject = arrayObject.reversedArray() //devuelve el arreglo en reversa
    for (a in arrayObject){
        println("Array reverso: $a")
    }
}