val mainList: MutableList<MutableList<Int>> = mutableListOf()
val winnerList = mutableListOf<String>()

fun main() {
    getInput()
    playGame()
    getOutput()
}

fun getInput() {
    print("Enter amount of case: ")
    val valuesAmount = readLine()!!.toInt()
    for(i in 1..valuesAmount) {
        val intValue = mutableListOf<Int>()
        val charValue = readLine()!!.toMutableList()
        charValue.forEach { intValue.add(it.toString().toInt()) }
        mainList.add(intValue)
    }
}

fun playGame() {
    for(index in 0..mainList.size-1) {
        var list = mainList[index]
        var determineValue = 0
        determineValue = playCase(list, determineValue)
        checkTheWinner(determineValue)
    }
}

fun playCase(list: MutableList<Int>, determineValue: Int): Int {
    var determineValue = determineValue
    while(true) {
        if(list.size == 0) {
            break
        } else {
            determineValue = playersStartBattle(list, determineValue)
        }
    }

    return determineValue
}

fun playersStartBattle(list: MutableList<Int>, determineValue: Int): Int {
    var determineValue = determineValue
    for(i in (0..list.size-1).toMutableList()) {
        if (i == (0..list.size-1).toMutableList().last()) {
            list.removeAt(i)
            determineValue++
            break
        } else {
            var listAmount = 0
            for(j in (0..list.size-1).toMutableList()) {
                if (j != i) listAmount += list[j]
            }

            if (listAmount % 3 == 0) {
                list.removeAt(i)
                determineValue++
                break
            }
        }
    }

    return determineValue
}

fun checkTheWinner(determineValue: Int) {
    if(determineValue % 2 == 0) winnerList.add("T") else winnerList.add("S")
}

fun getOutput() {
    for(i in 0..winnerList.size-1) {
        println("Case ${i+1}: ${winnerList[i]}")
    }
}