package AppBasic

fun main(){
    /**
     * Lambda bisa digunakan jika fungsinya simpel
     */
    val contohLambda: (String, String) -> String = {apel: String, mangga: String ->
        val hasil = "$apel $mangga"
        hasil
    }
    val result = println(contohLambda("Hello", "World"))
}