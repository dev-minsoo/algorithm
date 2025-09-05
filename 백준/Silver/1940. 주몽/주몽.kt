/**
 * p1940 주몽 (투포인터)
 */
fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }.sorted()

    var left = 0
    var right = n-1
    var count = 0

    while (left < right) {
        val sum = nums[left] + nums[right]

        if (sum == m) {
            count++
            left++
            right--
        } else if (sum < m) {
            left++
        } else {
            right--
        }
    }

    println(count)
}