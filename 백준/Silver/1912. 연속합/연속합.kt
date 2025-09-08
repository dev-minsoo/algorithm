/**
 * p1912 연속합 (카데인)
 */
fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    fun kadane(nums: List<Int>): Int {
        var currentSum = nums[0]
        var maxSum = nums[0]

        for (i in 1 until nums.size) {
            currentSum = maxOf(nums[i], currentSum + nums[i])
            maxSum = maxOf(maxSum, currentSum)
        }

        return maxSum
    }

    println(kadane(numbers))
}