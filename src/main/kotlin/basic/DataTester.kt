package basic

data class DataTester(val name: String, val id: Int)

fun getDataTester(): DataTester {
    return DataTester("Alex", 1)
}

fun main(args: Array<String>) {
    val user = getDataTester()
    println("name = ${user.name}, id = ${user.id}")
    println(user)

    // or

    val (name, id) = getDataTester()
    println("name = $name, id = $id")

    // or

    println("name = ${getDataTester().component1()}, id = ${getDataTester().component2()}")

    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }

    val secondUser = DataTester("Alex", 1)
    println("user == secondUser: ${user == secondUser}")

    // copy() function
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))
    println(user.copy("Max", 2))
}
