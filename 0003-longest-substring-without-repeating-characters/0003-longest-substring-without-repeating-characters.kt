class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = hashMapOf<Char, Int>()
        var left = 0
        var maxLength = 0

        for (right in s.indices) {
            if (s[right] in map) {
                left = maxOf(left, map[s[right]]!! + 1)
            }
            map[s[right]] = right
            maxLength = maxOf(maxLength, right-left+1)
        }

        return maxLength
    }
}