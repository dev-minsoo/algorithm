/**
 * p16194 카드 구매하기2
 */
fun main() {
    val n = readln().toInt()
    val P = intArrayOf(0) + readln().split(" ").map { it.toInt() }

    val dp = IntArray(n+1)
    for (i in 2 .. n) {
        dp[i] = Int.MAX_VALUE
    }
    dp[1] = P[1]


    for (i in 2 .. n) {
        for (j in 1 .. i) {
            dp[i] = minOf(dp[i], P[j] + dp[i-j])
        }
    }

    println(dp[n])
}