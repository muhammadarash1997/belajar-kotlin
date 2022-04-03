package AppBasic

infix fun String.to(apel: String): String {
    if (apel == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main(){
    val mangga = "Hello" to "UP"    //Merubah Hello menjadi HELLO
    println(mangga)
}