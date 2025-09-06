/**
 * p11052 카드 구매하기
 */
fun main() {
    val n = readln().toInt()
    val prices = intArrayOf(0) + readln().split(" ").map { it.toInt() }

    val dp = IntArray(n+1)
    dp[0] = 0
    dp[1] = prices[1]

    for (i in 2 .. n) {
        for (j in 1 .. i) {
            dp[i] = maxOf(dp[i], prices[j] + dp[i-j])
        }
    }

    println(dp[n])
}