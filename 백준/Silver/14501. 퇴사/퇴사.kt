/**
 * p14501 퇴사
 */
fun main() {
    val n = readln().toInt()
    val T = IntArray(n)
    val P = IntArray(n)

    repeat(n) { i ->
        val (t, p) = readln().split(" ").map { it.toInt() }
        T[i] = t
        P[i] = p
    }

    val dp = IntArray(n+2)

    for (i in n downTo 1) {
        if (i+T[i-1] <= n+1) {
            dp[i] = maxOf(dp[i+1], P[i-1] + dp[i+T[i-1]])
        } else {
            dp[i] = dp[i+1]
        }
    }

    println(dp[1])
}