fun main() {
    repeat(readln().toInt()) { i ->
        val sum = readln().split(" ").sumOf { it.toInt() }
        println("Case #${i+1}: $sum")
    }
}