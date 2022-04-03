package AppBasic

fun main(){
    fun salam(nilai: String, transform: (String) -> String): String {
        return "Hello ${transform(nilai)}"
    }

    val upperTransform = fun(bola: String): String{
        if(bola == ""){
            return "UPS"
        } else {
            return bola.toUpperCase()
        }
    }
    val lowerTransform = fun(bola: String): String{
        return bola.toLowerCase()
    }

    val hasil1 = salam("Good", upperTransform)                          //Ditulis secara tidak langsung
    val hasil2 = salam("Good", fun(bola: String): String {
        return bola.toLowerCase()
    })                                                                  //Ditulis secara langsung
    println(hasil1)
    println(hasil2)
}