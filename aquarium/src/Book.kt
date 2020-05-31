package aquarium

class Book(
    val title: String = "Foo",
    val author: String = "Bar",
    val year: String = "Baz",
) {

    fun authorAndTitle() = title to author

    fun titleAuthorAndYear() = Triple(title, author, year)
}