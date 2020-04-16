package Spices


fun main(args: Array<String>) {
    delegate()


}

fun createContainers() {
    val containers = listOf(
        SpiceContainer(
            Curry("Yellow Curry", "mild")
        ),
        SpiceContainer(Curry("Green curry", "hot")),
        SpiceContainer(Curry(name = "Yellow curry", spiciness = "mild"))
    )
    for (element in containers) {
        println(element.label)
    }


}

fun delegate() {
    val curry = Curry(spiciness = "mild")
    println("Curry color is ${curry.color}")
    createContainers()
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String = "Curry", spiciness: String, color: SpiceColor = YellowSpiceColor) :
    Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println(" grinding spice")
    }
}

data class SpiceContainer(var spice: Spice) {
    val label: String = spice.name
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    YELLOW(0xFFFF00),
    BLUE(0x0000FF);
}