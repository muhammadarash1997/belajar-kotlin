fun main() {
    print("Masukkan angka pertama: ")
    val a = readLine()!!.toInt()
    print("Masukkan angka kedua: ")
    val b = readLine()!!.toInt()

    println(findFPB(a, b))
    println(findKPK(a, b))
}

fun findFPB(a: Int, b: Int): String {
    val listA = (1..a).toList().filter { a % it == 0 }
    val listB = (1..b).toList().filter { b % it == 0 }
    val valueFPB = listA.intersect(listB).last()

    return "FPB dari $a dan $b adalah $valueFPB"
}

fun findKPK(a: Int, b: Int): String {
    val c = if (a > b) a else b
    val range = (1..c).toList()

    val listC = range.map { it * a }
    val listD = range.map { it * b }
    val valueKPK = listC.intersect(listD).first()

    return "KPK dari $a dan $b adalah $valueKPK"
}