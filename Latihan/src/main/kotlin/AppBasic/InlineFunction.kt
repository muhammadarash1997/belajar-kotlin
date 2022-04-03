package AppBasic

inline fun selamat(pagi: () -> String): String {   //Parameter selamat adalah sebuah lambda
    return "Hello ${pagi()}"                //Gunakan bracket karena parameternya adalah pagi dimana pagi adalah lambda
}

fun main(){
    println(selamat{"Budi"})                //Gunakan bracket karena parameternya adalah pagi dimana pagi adalah lambda
    println(selamat{"Agus"})                //Gunakan bracket karena parameternya adalah pagi dimana pagi adalah lambda
}