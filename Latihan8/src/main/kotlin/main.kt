val inputList = mutableListOf<Int>()
val outputList = mutableListOf<Int>()
fun main() {
    getInput()
    getValue()
    getOutput()
}

fun getInput() {
    print("Masukkan jumlah input: ")
    val inputAmount = readLine()?.toInt() ?: 0
    for(i in 1..inputAmount) {
        inputList.add(readLine()?.toInt() ?: 0)
    }
}

fun getValue() {
    for(i in inputList) {
        outputList.add(getAmount(i))
    }
}

fun getAmount(input: Int): Int {
    var initialValue = 1
    for(i in 1..input-1) {
        initialValue += combination(input-1, i)
    }
    return initialValue * input
}

fun combination(n: Int, i: Int): Int {
    val result = factorial(n) / (factorial(i)*factorial(n - i))
    return result
}

fun factorial(i: Int): Int {
    if(i == 1 || i == 0) {
        return 1
    } else {
        return i * factorial(i-1)
    }
}

fun getOutput() {
    for(i in 1..outputList.size) {
        println("Case #$i: ${outputList[i-1]}")
    }
}