fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    print(if (n * 100 >= m) "Yes" else "No")
}