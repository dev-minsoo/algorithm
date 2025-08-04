/**
 * p2579 계단 오르기
 */
fun main() {
    val n = readln().toInt()
    val score = IntArray(n) { readln().toInt() }

    when (n) {
        1 -> {
            println(score[0])
        }
        2 -> {
            println(score[0]+score[1])
        }
        else -> {
            val dp = IntArray(n)
            dp[0] = score[0]
            dp[1] = score[0] + score[1]
            dp[2] = maxOf(score[0]+score[2], score[1]+score[2])

            for (i in 3 until n) {
                dp[i] = maxOf(dp[i-3]+score[i-1]+score[i], dp[i-2]+score[i])
            }
            
            println(dp[n-1])
        }
    }
}