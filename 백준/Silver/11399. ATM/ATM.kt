/**
 * p11399 ATM
 */
fun main() {
    val n = readln().toInt()
    val times = readln().split(" ").map { it.toInt() }.sorted()

    var result = 0
    var waitTime = 0

    for (time in times) {
        waitTime += time
        result += waitTime
    }

    println(result)
}