package Aquarium

abstract class AquariumFish {
    abstract val color : String
}

class Shark: AquariumFish(), FishAction{
    override val color = "Gray"
    override fun eat(){
        println(" hunt and eat fish")
    }
}

class Plecostumus : AquariumFish(), FishAction{
    override val color = "Gold"
    override fun eat() {
        println( " munch on algae")
    }
}

interface FishAction{
  fun eat()
}