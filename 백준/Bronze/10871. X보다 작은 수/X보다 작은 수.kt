fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    print(readln().split(" ").map { it.toInt() }.filter { it < x }.joinToString(" "))
}