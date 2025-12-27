/**
 * p21921 블로그
 */
fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }

    // 초기 윈도우
    var sum = numbers.take(x).sum()

    var maxSum = sum
    var maxSumCount = 1

    // 슬라이딩 윈도우
    for (i in x until n) {
        sum += numbers[i] - numbers[i-x]
        when {
            sum > maxSum -> {
                maxSum = sum
                maxSumCount = 1
            }
            sum == maxSum -> maxSumCount++
        }
    }

    println(
        if (maxSum == 0) "SAD"
        else "$maxSum\n$maxSumCount"
    )
}