package aquarium


fun main(args: Array<String>) {

    collectionExamples()
}

fun collectionExamples() {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")

    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

}

fun pairExamples() {
    val equipment = "fishnet" to "catching fish"
    val (tool, use) = equipment

    println("$tool to $use")
}