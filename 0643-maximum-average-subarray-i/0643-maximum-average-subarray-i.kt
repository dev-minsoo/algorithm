class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = nums.take(k).sum()
        var max = sum 

        for (i in k until nums.size) {
            sum += nums[i] - nums[i-k]
            max = maxOf(max, sum)
        }

        return max.toDouble() / k
    }
}