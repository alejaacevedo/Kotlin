package Aquarium

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val plant = GreenLeafyPlant(size = 10)
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull(){
    this?.apply{
        println("removing $this")
    }
}
fun main(args: Array<String>) {
    val nullPlant : AquariumPlant? = null
    nullPlant.pull()
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  /* what will it print?*/
    println(aquariumPlant.isGreen)
}