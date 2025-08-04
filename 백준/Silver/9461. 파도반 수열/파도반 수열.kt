/**
 * p9461 파도반 수열
 */
fun main() {
    val T = readln().toInt()
    repeat(T) {
        val N = readln().toInt()

        if (N <= 3)  println(1)
        else {
            val dp = LongArray(N)
            dp[0] = 1
            dp[1] = 1
            dp[2] = 1

            for (i in 3 until N) {
                dp[i] = dp[i-3] + dp[i-2]
            }

            println(dp[N-1])
        }
    }
}