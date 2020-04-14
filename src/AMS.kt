import java.util.*

fun main(args: Array<String>) {
    println("Hello,${args[0]}!")
    feedTheFish()
    println(fitMoreFish(10.0, listOf(3, 3, 3)))
    println(fitMoreFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1, 2, 3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println(" Today is $day and the fish eat $food")

    swim("slow")
    shouldChangeWater(day)
    shouldChangeWater(day, 25, 22)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day)) {
        println("You have to change the water today")
    }
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {

    // Inline functions

    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorReading() = 20


fun fitMoreFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {

    val totalCapacity = if (hasDecorations) tankSize * 0.8 else tankSize
    var actualCapacity: Int = currentFish.sum()
    return (totalCapacity - actualCapacity) >= fishSize


    "elegant way --> return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)"
}

fun swim(speed: String = "fast") {
    println(" Swimming $speed")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitos"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}
