/**
 * p11659 구간 합 구하기4
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }

    val prefixSum = IntArray(n+1)
    prefixSum[0] = 0
    for (i in 1 .. n) {
        prefixSum[i] = prefixSum[i-1] + numbers[i-1]
    }

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        println(prefixSum[j] - prefixSum[i-1])
    }
}