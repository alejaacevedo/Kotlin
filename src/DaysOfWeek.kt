import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
   dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( "It is " +
            when (day){
               1 -> "sunday"
                2-> "monday"
                3 -> "tuesday"
                4 -> "wednesday"
                5 -> "thursday"
                6 -> "friday"
                else-> "saturday"
            })

}

