val inputsMainList: MutableList<MutableList<Int>> = mutableListOf()
var mainListsIndex = mutableListOf<Int>()

val permutationsList: MutableList<MutableSet<Int>> = mutableListOf()
var permutationsListsIndex = mutableListOf<Int>()

var valuesAmount = 0
var permutationsAmount = 0

fun main() {
    getInput()
    permutationsAmount = factorial(valuesAmount)
    getEachPermutation()
    sumPermutation()
}

fun getInput() {
    for(T in 0..20000) {
        print("Masukkan jumlah input: ")
        val input = readLine()?.toInt() ?: 0
        if(input == 0) {
            break
        } else if(1 <= input && input <= 12) {
            val innerList = mutableListOf<Int>()
            for(i in 1..input) {
                innerList.add(readLine()!!.toInt())
            }
            inputsMainList.add(T, innerList)
        } else {
            continue
        }
    }
    mainListsIndex = (0..inputsMainList.size-1).toMutableList()
}

fun factorial(valuesAmount: Int): Int {
    if(valuesAmount == 1 || valuesAmount == 0) {
        return 1
    } else {
        return valuesAmount * factorial(valuesAmount-1)
    }
}

fun getPermutation(list: MutableList<Int>, loopsAmount: Int, i: String, u: Int) {
    val result = i
    if(loopsAmount == 0) {
        permutationsList[u].add(result.toInt())
    }

    for(i in list) {
        val a = createList(list, i)
        getPermutation(a, (loopsAmount-1), (result+"${inputsMainList[u][i]}"), u)
    }
}

fun createList(list: MutableList<Int>, i: Int): MutableList<Int> {
    val recentList = mutableListOf<Int>()
    for(j in list) {
        if(j != i) recentList.add(j)
    }
    return recentList
}

fun getEachPermutation() {
    for(u in mainListsIndex) {
        permutationsList.add(u, mutableSetOf<Int>())
        val inputsListSize = inputsMainList[u].size
        val inputsIndex = (0..inputsListSize-1).toMutableList()
        getPermutation(inputsIndex, inputsListSize,"" , u)
    }
}

fun sumPermutation() {
    permutationsListsIndex = (0..permutationsList.size-1).toMutableList()
    for(u in permutationsListsIndex) {
        var permutationsResult = 0
        permutationsList[u].forEach { value ->
            permutationsResult += value
        }
        println(permutationsResult)
    }
}