import model.Camera

fun main(args: Array<String>) {

    val camera = Camera()
    camera.turnOf()
    println("La camara esta: ${camera.isOn}")
    camera.isOn = true
    println("La camara esta: ${camera.isOn}")
}