/**
 * p2475 검증수
 */
fun main() {
    print(readln().split(" ").map { it.toInt() }.sumOf { it*it } % 10)
}