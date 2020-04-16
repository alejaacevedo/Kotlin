package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostumus2()
    println("Plecostumus are ${pleco.color}")
    println(pleco.eat())
}

interface FishAction2 {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostumus2(fishColor: FishColor = GoldColor) :
    FishAction2 by printingFishAction("munch algae"),
    FishColor by fishColor


object GoldColor : FishColor { // a class that only has one instance
    override val color = "Gold"
}

object RedColor : FishColor {
    override val color = "Red"
}

class printingFishAction(val food: String) : FishAction2 {
    override fun eat() {
        println( "$food")
    }
}