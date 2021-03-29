fun main(args: Array<String>) {
    println("Hola mundo desde platzi")

   val nombre = "Erwin"
   val apellido: String = "Leon"
   val a: Int = 4 //buena practica definir el tipo de dato
   println("Tu nombre es: $nombre $apellido")
    //raw String
    val nombreApellido = "Erwin \"Leon\""
    println("Tu nombre es: $nombreApellido")
    val parrafo ="""
        ** Lorem Ipsum es un texto que parece latín, 
        ** pero en realidad no tiene sentido tampoco 
        ** en este idioma. Su título deriva del latín 
        ** dolorem ipsum, que significa «el dolor en sí».
    """.trimIndent()
    println(parrafo.trimMargin("** "))



}