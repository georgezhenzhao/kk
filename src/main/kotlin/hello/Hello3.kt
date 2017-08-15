package hello

class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }

    fun greet2() {
        println("Hello2, ${name}");
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
    Greeter(args[1]).greet2()
}