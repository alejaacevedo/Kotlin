package Aquarium

fun main(args: Array<String>){
 createFish()
    val sympthoms = mutableListOf("white spots", "red spotts", "not eating", "bloating", "belly up")
    sympthoms.add("white fungus")
    sympthoms.remove("white fungus")
}

fun feedFish(fish: FishAction){ // the fish must implement fishAction
    fish.eat()
}
fun createFish(){
    val shark = Shark()

    val pleco = Plecostumus()

    println( "Fishes in the aquarium are ${shark.color} and ${pleco.color}")
        shark.eat()
        pleco.eat()
}