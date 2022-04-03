val inputsList = mutableListOf<Long>()
val palindromesList = mutableListOf<Long>()

fun main() {
    getValue()
    displayOutput()
}

fun getValue() {
    while(true) {
        print("Masukkan input: ")
        val inputValue = readLine()!!.toLong()
        if(inputValue != 0L) inputsList.add(inputValue) else break
    }

    if(inputsList.size != 0) {
        val inputsListSorted = inputsList.sorted()
        val higherValue = inputsListSorted.last()
        createPalindromesList(higherValue)
    }
}

fun displayOutput() {
    if(inputsList.size != 0) {
        for(i in inputsList) {
            println(palindromesList[i.toInt()-1])
        }
    } else {
        println("null")
    }
}

fun createPalindromesList(higherValue: Long) {
    for(value in 1..100000000L) {
        if(palindromesList.size.toLong() == higherValue) break
        getForwardsValue(value)
    }
}

fun getForwardsValue(value: Long) {
    val valForwards = value.toString().toMutableList()
    getBackwardsValue(valForwards, value)
}

fun getBackwardsValue(valForwards: MutableList<Char>, value: Long) {
    val valBackwards = mutableListOf<Char>()
    for(i in valForwards.size-1 downTo 0) {
        valBackwards.add(valForwards[i])
    }
    checkForwardsBackwards(valForwards, valBackwards, value)
}

fun checkForwardsBackwards(valForwards: MutableList<Char>, valBackwards: MutableList<Char>, value: Long) {
    var counter = 0
    for(i in 0..valForwards.size-1) {
        if(valForwards[i] == valBackwards[i]) counter++
        if(counter == valForwards.size) palindromesList.add(value)
    }
}