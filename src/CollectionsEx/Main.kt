package CollectionsEx

fun main(args: Array<String>) {
    val testList = (11..20).toList()
    println(testList)
    println(reverseList(testList))
    println(reverseListAgain(testList))
    println(testList.reversed())
    1 shl 2 // demonstration of use of an infix call is equal to 1.shl(2)

}


infix fun Int.shl(x:Int): Int { return x + 2}

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