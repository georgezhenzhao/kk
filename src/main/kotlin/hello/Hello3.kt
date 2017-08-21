package hello

class Greeting(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }

    fun greet2() {
        println("Hello2, ${name}");
    }
}

fun main(args: Array<String>) {
    Greeting(args[0]).greet()
    Greeting(args[1]).greet2()
}