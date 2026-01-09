class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = hashSetOf<Char>()
        var left = 0
        var maxLength = 0

        for (right in s.indices) {
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            maxLength = maxOf(maxLength, right-left+1)
        }
        
        return maxLength
    }
}