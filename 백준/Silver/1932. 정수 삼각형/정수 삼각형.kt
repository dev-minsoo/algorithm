/**
 * p1932 정수 삼각형
 */
fun main() {
    val n = readln().toInt()
    val triangle = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    val dp = Array(n) { i -> IntArray(i+1) }

    dp[0][0] = triangle[0][0]

    for (i in 1 until n) {
        for (j in 0..i) {
            when (j) {
                0 -> dp[i][j] = dp[i-1][j] + triangle[i][j]
                i -> dp[i][j] = dp[i-1][j-1] + triangle[i][j]
                else -> dp[i][j] = maxOf(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j]
            }
        }
    }

    println(dp[n-1].max())
}