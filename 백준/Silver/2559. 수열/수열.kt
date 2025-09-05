/**
 * p2559 수열
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }

    val sums = mutableListOf<Int>()
    var windowSum = nums.take(k).sum()
    sums.add(windowSum)

    for (i in k until n) {
        windowSum = windowSum - nums[i-k] + nums[i]
        sums.add(windowSum)
    }

    println(sums.max())
}