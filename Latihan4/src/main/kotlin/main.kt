import kotlin.math.pow

fun main() {
    print("Masukkan m: ")
    val a = readLine()!!.toLong()
    print("Masukkan n: ")
    val b = readLine()!!.toLong()

    var m: Long = if(a > 1L && a < 5000L) a else 0
    var n: Long = if(b > 0L && b < 25L) b else 0

    println(calculate(m, factorial(n)))
}

fun calculate(m: Long, valueFactorial: Long): String {
    val list: MutableList<Int> = mutableListOf()

    for(i in 2..5000) {
        var valuePower = m.toDouble().pow(i).toDouble()
        var resultDouble = (valueFactorial/valuePower)
        var resultInt = resultDouble.toInt()

        if(resultDouble % resultInt == 0.0) {
            list.add(i)
        }
    }

    return "Pangkat tertinggi dari m yang dapat membagi n! adalah ${list.last()}"
}

fun factorial(n: Long): Long {
    if(n == 1L) {
        return 1
    } else {
        return n * factorial(n-1)
    }
}