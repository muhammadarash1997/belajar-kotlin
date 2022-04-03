val list1 = mutableListOf<Any>()
val list2 = mutableSetOf<Any>()

fun main() {
    findList()
    filterList()
    showList()
}

fun findList() {
    i@
    for(i in 1..10000) {
        if(i == 2) continue@i
        if(i == 1) {
            list1.add(i)
            list1.add(i)
        }

        j@
        for(j in 2..(i-1)) {
            var n = i
            while(n % j == 0) {
                n /= j
                if(n == 1) {
                    list1.add(i)
                    continue@j
                }
            }
        }
    }
}

fun filterList() {
    for(i in 0..(list1.size-1)) {
        if(i <= (list1.size-2)) {
            if (list1[i] == list1[i + 1]) list2.add(list1[i])
        }
    }
}

fun showList() {
    println("Bilangan bulat positif dari 1 s/d 10000 yang memiliki hasil akar lebih dari satu adalah\n$list2")
}