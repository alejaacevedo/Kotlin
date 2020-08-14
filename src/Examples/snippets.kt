package Examples

import java.lang.IllegalArgumentException
import java.util.Random

val names = arrayOf("Anne", "Alex", "Brian", "Jack")
inline fun addition(a: Int, b: Int) = a + b //recopier le code à chaque appel et aimelorer les performances de execution

var optionnelle: String? = null
val valeur = optionnelle ?: "Valeur par defaut"

/** Arrays  FIXED SIZE**/
var stringArray = arrayOf("dog", "cat")
var numberArray = Array<Int>(6) { i -> (2 * i) }
val value = stringArray[1]


/** Lists VARIABLE SIZE**/
var shoppingList = mutableListOf("milk", "eggs")
var fixedShoppingList = listOf("milk","eggs")

fun somme(vararg numbers: Int): Int {
    shoppingList.add("cherries")

    var result = 0
    for (n in numbers) {
        result += n
    }
    return result


}

enum class PhoneType(val value: Int){
    MOBILE(0),
    FIXED(1),
    SATELLITE(2);

    companion object {
        private val map = PhoneType.values().associateBy(PhoneType::value);
        fun fromInt(type: Int) = map[type] ?: throw IllegalArgumentException()
    }
}

/** Extensions **/
fun Collection<String>.randomValue() : String{
    val sorted = sortedBy { it }
    val index = Random().nextInt(sorted.size)
    return sorted[index]
}

fun main() {

    val coolPhoneType = PhoneType.fromInt(2)
    println(coolPhoneType)

    for( number in numberArray){
        println(number)
    }
    println("----------------------")
    println(somme(1, 2, 3, 4))
    println("----------------------")

    for (name in names) {
        println("hello $name")
    }
    println("----------------------")

    for (character in "Hello") {
        println(character)
    }
    println("----------------------")

    var n = 2
    while (n < 100) {
        n = n * 2
    }
    println(n)
    println("----------------------")

    var m = 2
    do {
        m = m * 2
    } while (m < 100)
    println(m)
    println("----------------------")

}