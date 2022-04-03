val factorN = mutableListOf<Int>()
var cardinality = 0

fun main() {
    print("Masukkan KPK: ")
    val valueN = readLine()!!.toInt()

    divideN(valueN)
    findPairs(factorN, valueN)

    println("Banyaknya pasangan angka yang memiliki KPK sama dengan $valueN adalah sebanyak $cardinality pasang")
}

fun findKPK(a: Int, b: Int, valueN: Int) {
    val c: Int = if (a > b) a else b
    val range = (1..c).toList()
    val listC = range.map { it * a }
    val listD = range.map { it * b }
    val valueKPK = listC.intersect(listD).first()
    if(valueKPK == valueN) {
        cardinality++
    }
}

fun divideN(valueN: Int) {
    for(i in 1..valueN) {
        if(valueN % i == 0) {
            factorN.add(i)
        }
    }
}

fun findPairs(factorN: MutableList<Int>, valueN: Int) {
    for(i in factorN) {
        for(j in factorN) {
            if(i <= j) {
                findKPK(i, j, valueN)
            }
        }
    }
}