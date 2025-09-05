import kotlin.math.abs

/**
 * p2470 두 용액 (투포인터)
 */
fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }.sorted()

    var left = 0
    var bestLeft = 0
    var right = n-1
    var bestRight = n-1
    var minDiff = abs(nums[left] + nums[right])

    while (left < right) {
        val sum = nums[left] + nums[right]
        val currentDiff = abs(sum)
        if (currentDiff < minDiff) {
            minDiff = currentDiff
            bestLeft = left
            bestRight = right
        }

        if (sum == 0) break
        else if (sum < 0) left++
        else right--
    }

    println("${nums[bestLeft]} ${nums[bestRight]}")
}