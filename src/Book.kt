import  java.util.Random

open class Book(
    val title: String = " la historia de lisey",
    val author: String = " Stephen King",
    val year: Int = 2005,
    var pages: Int = 200
) {
    var currentPage = 0
    open fun readPage() {
        currentPage++
    }

    fun bookInfo(): Pair<String, String> {
        return title to author
    }

    fun detailedInfo(): Triple<String, String, Int> {
        return Triple(
            bookInfo().first,
            bookInfo().second,
            year
        )
    }
}

fun Book.weight() = pages * 1.5

fun Book.tornPages(tornPages: Int) {
    if (pages >= tornPages) pages -= tornPages else pages = 0
}

class Puppy {

    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

class Ebook(val format: String = "text") : Book() {
    var wordCount = 0
    override fun readPage() {
        wordCount = +250
    }
}

fun main(args: Array<String>) {
    val hungerGames = Book("The Hunger Games", "Suzanne Collins", 2010)

    val (title, author, year) = hungerGames.detailedInfo()
    println(" The book you bought is $title written by $author in $year")

    val allBooks = setOf("Hamlet", "Romeo & Juliette", "King lear")

    val library = mapOf("William Shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf(
        "Doctor sleep" to "Stephen King",
        "Thinner Leaner Stronger" to "Matt Mathews",
        "El club de las 5 de la manana" to "Robin Sharma"
    )
    moreBooks.getOrPut("Doctor sleep") { "Stephen King" }
    moreBooks.getOrPut("The Hunger Games") { "Suzanne Collins" }
    println(moreBooks)

    val puppy = Puppy()
    val book = Book(pages = 540)
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title} ")
    }
    println { " sad puppy no more pages left in ${book.title}" }
}