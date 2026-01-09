class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxLength = 0
        var count = 0

        for (num in nums) {
            if (num == 0) {
                count = 0
            } else {
                count++
                maxLength = maxOf(maxLength, count)
            }
        }

        return maxLength
    }
}