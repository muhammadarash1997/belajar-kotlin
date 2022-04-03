val mainList: MutableList<List<Int>> = mutableListOf()
val outList = mutableListOf<Int>()
var amount = 0

fun main() {
    getInput()
    getOutput()
}

fun getOutput() {
    for(i in 0..mainList.size-1) {
        amount = 0
        getAmount(mainList[i].first(), mainList[i].last())
        outList.add(amount)
    }
    for(i in outList) {
        println(i)
    }
}

fun getInput() {
    while(true) {
        val items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
        if(items.first() == 0 && items.last() == 0) {
            break
        } else {
            mainList.add(items)
        }
    }
}

fun getAmount(limit: Int, loop: Int, value: Int = 0): Int {
    if(value == limit && loop == 0) amount++
    if(loop == 0) return 0
    for(i in 0..limit) {
        getAmount(limit, loop-1, value+i)
    }
    return 0
}