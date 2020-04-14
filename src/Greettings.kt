
fun main(args: Array<String>){
    println(when(args[0].toInt()){
        in 0..12 -> "Good morning kotlin"
        else -> "Good night Kotlin"
    })


    if (args[0].toInt() < 12) println("Good morning, Kotlin")
    else println("Good night, Kotlin" )

    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
}