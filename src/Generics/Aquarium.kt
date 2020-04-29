package Generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing){
            cleaner.clean(waterSupply)
        }
        println("adding water from $waterSupply")
    }
    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}
fun genericsExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    isWaterClean(aquarium)
   // println(" water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.addWater(cleaner)
    isWaterClean(aquarium)
   // println(" water needs processing: ${aquarium.waterSupply.needsProcessing}")
    val aquarium2 = Aquarium(LakeWater())
  /*  aquarium2.waterSupply.filter()
    aquarium2.addWater()
    addItemTo(aquarium)*/

}


fun main(args: Array<String>) {
    genericsExample()
}
