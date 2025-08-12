/**
 * p2438 별 찍기 - 1
 */
fun main() {
    repeat(readln().toInt()) { it ->
        println("*".repeat(it+1))
    }
}
