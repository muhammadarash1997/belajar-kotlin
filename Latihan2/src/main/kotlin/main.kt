val mainList: MutableList<List<Int>> = mutableListOf()

fun main() {
    getInput()
    getOutput()
}

fun getInput() {
    val inputsAmount = readLine()!!.toInt()
    for(i in 1..inputsAmount) {
        val items = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
        mainList.add(items)
    }
}

fun getOutput() {
    for(i in 0..mainList.size-1) {
        if(mainList[i].last() % mainList[i].first() == 0) {
            println(mainList[i].last() / mainList[i].first())
        } else {
            println("NO SOLUTION")
        }
    }
}