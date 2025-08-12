/**
 * p1330 두 수 비교하기
 */
fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    if (a < b) println("<")
    else if (a > b) println(">")
    else println("==")
}