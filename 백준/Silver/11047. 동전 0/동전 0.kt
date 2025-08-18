/**
 * p11047 동전 0
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val coins = IntArray(n) { readln().toInt() }

    var remain = k
    var count = 0

    for (i in n-1 downTo 0) {
        if (remain >= coins[i]) {
            count += remain / coins[i]
            remain %= coins[i]
        }

        if (remain == 0) break
    }

    print(count)
}