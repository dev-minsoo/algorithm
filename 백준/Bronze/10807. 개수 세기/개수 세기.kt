/**
 * p10807 개수 세기
 */
fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()

    println(numbers.count { it == v })
}
