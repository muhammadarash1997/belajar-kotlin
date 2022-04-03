val inputsList: MutableList<MutableList<Int>> = mutableListOf()
fun main() {
    getInput()
    println(inputsList)
    println(inputsList[0][2])
    for(i in inputsList[0]) {
        println(i)
    }
}

fun getInput() {
    for(T in 0..20000) {
        print("Masukkan jumlah input: ")
        val input = readLine()!!.toInt()
        if(input == 0) {
            break
        } else if(1 <= input && input <= 12) {
            val innerList = mutableListOf<Int>()
            for(i in 1..input) {
                innerList.add(readLine()!!.toInt())
            }
            inputsList.add(T, innerList)
        } else {
            continue
        }
    }
}