import model.Camera
import model.Movie
import model.Product
import model.Shoe

fun main(args: Array<String>) {

    val camera = Camera()
    camera.turnOf()
    camera.turnOn()
    println(camera.getCameraStatus())

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")


    camera.setFrontalCamera(false)
    println("Camara frontal: ${camera.getCameraUse()}")

    camera.setMicrofono(true)
    println("Microfono ensendido: ${camera.getMicrofono()}")

    var shoe = Shoe("Shoe", "Blue Shoes",1, "Praga")
    println("Shoe: ${shoe.toString()}")

    shoe.create()


    /*shoe.size = 37
    println(shoe.size)

    println(shoe.mark)

    shoe.model = "Tenis"
    println(shoe.model)*/


    val movie = Movie("Coco", "Pixar", 120)
    println("MOVIE")
    println(movie.creator)
    println(movie.title)
    println(movie.duration)
    println("${movie.duration} min.")

var resultado: Int = calculadora(1, 2, 3,::multiplicar)
println("El resultado es: $resultado ")

    println("El resultado es: ${calculadora(4, 5, 6, ::restar)} ")

}

fun calculadora(a: Int, b: Int, c: Int, operacion:(Int, Int, Int)-> Int): Int{
    return operacion(a, b, c)
}

fun sumar(a: Int, b: Int, c: Int) = a+b+c
fun restar(a: Int, b: Int, c: Int) = a-b-c
fun multiplicar(a: Int, b: Int, c: Int) = a*b*c