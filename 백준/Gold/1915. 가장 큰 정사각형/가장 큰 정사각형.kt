/**
 * p1915 가장 큰 정사각형 (DP)
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = Array(n) { readln().toCharArray().map { it.digitToInt() } }

    val dp = Array(n) { IntArray(m) }
    var maxSide = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (board[i][j] == 1) {
                dp[i][j] = if (i==0 || j==0) {
                    1
                } else {
                    minOf(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) +1
                }
                maxSide = maxOf(maxSide, dp[i][j])
            }
        }
    }

    println(maxSide*maxSide)
}