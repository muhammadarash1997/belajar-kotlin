fun main() {
    val inputValue = readLine()?.toInt() ?: 0
    val list = (1..1000000).toMutableList()
    var firstValue = list.first()
    var lastValue = list.last()
    while(true) {
        val guessValue = (firstValue + lastValue)/2
        if(guessValue == inputValue) {
            println("nilai ditemukan")
            break
        }
        if(guessValue > inputValue) {
            lastValue = guessValue
        }
        if(guessValue < inputValue) {
            firstValue = guessValue
        }
    }
}