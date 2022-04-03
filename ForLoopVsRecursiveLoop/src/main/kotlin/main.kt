/**
 * For Loop
 * 111 112 121 122 211 212 221 222
 */
/*fun main() {
    for(i in 1..2) {
        print("$i")
        for(j in 1..2) {
            print("$j")
            for(k in 1..2) {
                print("$k")
            }
        }
    }
}*/

/**
 * Recursive Loop
 */
fun main() {
    por(2, 4)               // por(a, b) a adalah untuk argumen for, b adalah banyaknya loop
}
fun por(j: Int, jumlahForLoop: Int): Int {
    if(jumlahForLoop == 0) return 0

    for(i in 1..j) {
        print(i)
        por(j, (jumlahForLoop-1))
    }

    return 0
}