fun main(args: Array<String>) {
    whatShouldIDoToday("happy")
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24
): String {
    return when {
        isHappy(mood, weather) -> "go for a walk"
        isSadandRainy(mood, weather) -> "stay in bed"
        isTemperatureHot(temperature) -> "go swimming"
        else -> "stay home and read"
    }
}

private fun isTemperatureHot(temperature: Int) = temperature > 35

private fun isHappy(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

private fun isSadandRainy(mood: String, weather: String) = mood == "sad" && weather == "rainy"