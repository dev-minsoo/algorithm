/**
 * p2003 수들의 합2
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }.toIntArray()

    var left = 0
    var right = 0
    var count = 0
    var currentSum = 0

    while (right < n) {
        when {
            currentSum < m -> {
                currentSum += nums[right]
                right++
            }
            currentSum == m -> {
                count++
                currentSum -= nums[left]
                left++
            }
            else -> {
                currentSum -= nums[left]
                left++
            }
        }
    }

    while (left < n) {
        if (currentSum == m) {
            count++
        }
        currentSum -= nums[left]
        left++
    }

    println(count)
}