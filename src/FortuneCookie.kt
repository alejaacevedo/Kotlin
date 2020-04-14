import java.util.*

fun main(args: Array<String>) {
    var fortune: String
    for(i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\n your fortune cookie says : $fortune")
        if( fortune.contains(" take it easy")) break
    }
}



fun getFortuneCookie(birthday: Int): String {
    val message = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

   return message[ when (birthday ) {
       28,31 -> 2
       in 0..12 -> 4
       else -> birthday.rem(message.size)}
   ]

}

fun getBirthday(): Int{
    print("\n enter your birthday")
    return readLine()?.toIntOrNull() ?: 1
}