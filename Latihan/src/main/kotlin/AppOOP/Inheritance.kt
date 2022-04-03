package AppOOP

open class Employee {
    var namaEmployee: String = ""
    var usiaEmployee: Int = 0

    fun sayEmployee() {
        println("I am a employee")
    }
}

open class Manager: Employee() {
    var namaManager: String = ""
    var usiaManager: Int = 0

    fun sayManager() {
        println("I am a manager")
    }
}

class SuperManager: Manager() {
    var namaSuperManager: String = ""
    var usiaSuperManager: Int = 0

    fun saySuperManager() {
        println("I am a Super Manager")
    }
}

fun main() {
    val employee1 = Employee()
    employee1.sayEmployee()

    val manager1 = Manager()
    manager1.sayEmployee()
    manager1.sayManager()

    val superManager1 = SuperManager()
    superManager1.sayEmployee()
    superManager1.sayManager()
    superManager1.saySuperManager()
}