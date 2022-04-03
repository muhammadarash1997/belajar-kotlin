/**
 * Permutasi
 */

val listOfInput = mutableListOf<Int>(1,2,3,4,5)
val indexOfInput = (0..listOfInput.size-1).toMutableList()
val listOfPermutation = mutableSetOf<Int>()

fun main() {
    por(indexOfInput, listOfInput.size, "")     // por(a, b) a = index dari list => batas di dalam for, b = jumlah input => banyaknya loop
    println(listOfPermutation)
}

fun por(list: MutableList<Int>, numbersOfLoop: Int, i: String) {
    val result = i
    if(numbersOfLoop == 0) {
        listOfPermutation.add(result.toInt())
    }

    for(i in list) {
        val a = createList(list, i)                                    // create(a, b) => buat list baru kecuali i
        por(a, (numbersOfLoop-1), (result+"${listOfInput[i]}"))
    }
}

fun createList(list: MutableList<Int>, i: Int): MutableList<Int> {
    val recentList = mutableListOf<Int>()
    for(j in list) {
        if(j != i) recentList.add(j)
    }
    return recentList
}