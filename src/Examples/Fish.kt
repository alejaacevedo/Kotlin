package Examples

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy")

    // Without inlining the function
    myWith(fish.name) {
        // High order functions
        println(capitalize())
    }

    // with inline function
    fish.name.capitalize()

    // returns execution for a lamda
    fish.run { name }

    // Apply returns the object after applying the function
    val fish2 = Fish(name = "splashy").apply {
        name = "sharky"
    }
    println(fish2)
    // Let only prints the copy of an object
    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })

    println(fish)
}

// Defining my own High order function
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun runExample(){

    JavaRun.runNow {println("Passing a lambda as a runnable")}
}

//Class.singleAbstractMethod { lambda_of_override }

fun main(args: Array<String>) {
    fishExamples()
    runExample()
}