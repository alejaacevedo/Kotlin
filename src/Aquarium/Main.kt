package Aquarium

fun main(args: Array<String>){
 createFish()
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