open class Book(
    val title: String = " la historia de lisey",
    val author: String = " Stephen King"
) {
    var currentPage=0
 open fun readPage(){
     currentPage++
 }
}

class Ebook(val format: String = "text") : Book(){
    var wordCount = 0
    override fun readPage(){
        wordCount =+ 250
    }
}
