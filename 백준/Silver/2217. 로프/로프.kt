/**
 * p2217 로프
 */
fun main() {
    val n = readln().toInt()
    val ropes = Array(n) { readln().toInt() }

    ropes.sort()
    var maxWeight = 0
    for (i in 0 until n) {
        val currentWeight = ropes[i] * (n - i)
        maxWeight = maxOf(maxWeight, currentWeight)
    }

    print(maxWeight)
}