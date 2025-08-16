fun main() {
    while (true) {
        val input = readln().split(" ").map { it.toInt() }.sorted()
        val (a, b, c) = input

        if (a == 0 && b == 0 && c == 0) {
            return
        }

        if (a * a + b * b == c * c) {
            println("right")
        } else {
            println("wrong")
        }
    }
}