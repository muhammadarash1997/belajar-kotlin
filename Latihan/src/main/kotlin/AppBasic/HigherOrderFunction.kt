package AppBasic

fun hello(nilai: String, transformasi: (String) -> String): String {
    return "Hello ${transformasi(nilai)}"
}

fun main(){
    val upperTransformasi = {nilai: String -> nilai.toUpperCase()}
    val lowerTransformasi = {nilai: String -> nilai.toLowerCase()}

    val result1 = hello("Good", upperTransformasi)                       //Ditulis secara tidak langsung
    val result2 = hello("Good", {nilai: String -> nilai.toLowerCase()})  //Ditulis secara langsung
    val result3 = hello("Good") {nilai: String -> nilai.toLowerCase()}   //Ditulis secara langsung cara Trailing Lambda

    println(result1)
    println(result2)
    println(result3)
}