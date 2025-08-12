fun main() {
    while (true) {
        val input = readlnOrNull() ?: break
        val (a, b) = input.split(" ").map { it.toInt() }
        println(a + b)
    }
}