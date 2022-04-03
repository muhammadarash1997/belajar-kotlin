package AppBasic

fun String.hello(): String = "Hello $this"

fun main() {
    val name: String = "Budi"
    println(name.hello())
}