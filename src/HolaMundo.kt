

fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

    //Ejemplo null safety
    //con el signo de interrogacion recive el valor nulo
    //si usamos double bang simpre tiene que ir con su cathc
    /*try {
    var compute: String? = null
    var longitud: Int = compute!!.length



    }catch (e: NullPointerException){
        println("no se aceptan valores nulos")
    }*/
    //llamada segura evita caer en execpciones
    var compute: String? = null
    var longitud: Int? = compute?.length // null
    println("Longitude: $longitud")

    //operador elvis

    var teclado: String? = null
    var longitudeTeclado: Int = teclado?.length ?: 0
    println("Longitud del teclado: $longitudeTeclado")

    var listWhitNulls: List<Int?> = listOf<Int?>(7, null, null)
    println("Lista con null: ${listWhitNulls}")
    val listWithoutNulls: List<Int?> = listWhitNulls.filterNotNull() // filtra lo que nos siver es decir solo queremos que nos imprima los valores no nulos
    println(listWithoutNulls)

}