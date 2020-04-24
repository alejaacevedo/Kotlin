package CollectionsEx

fun main(args: Array<String>) {
    val testList = (11..20).toList()
    println(testList)
    println(reverseList(testList))
    println(reverseListAgain(testList))
    println(testList.reversed())

}

fun reverseList(sampleList: List<Int>): List<Int> {
    val reverseList = mutableListOf<Int>()
    for (i in 0..sampleList.size - 1) {
        reverseList.add(sampleList[sampleList.size - i - 1])
    }
    return reverseList
}

fun reverseListAgain(sampleList: List<Int>): List<Int> {
    val reverseList = mutableListOf<Int>()
    for (i in sampleList.size - 1 downTo 0) {
        reverseList.add(sampleList.get(i))
    }
    return reverseList
}