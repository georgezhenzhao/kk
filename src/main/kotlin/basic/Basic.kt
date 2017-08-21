package basic

fun main(args: Array<String>) {

    for (name in args) {
        println(getString(name))
        typecases(name)
    }

    println(max(parseInt(args[0]), parseInt(args[1])))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return 0
}

fun getString(obj: Any): String {
    if (obj is String)
        return "$obj is String."
    return "$obj isn't String."
}

fun typecases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "a" -> println("String a")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}