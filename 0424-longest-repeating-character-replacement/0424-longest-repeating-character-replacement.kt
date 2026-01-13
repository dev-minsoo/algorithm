class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freq = IntArray(26)
        var left = 0
        var maxFreq = 0
        var maxLength = 0

        for (right in s.indices) {
            val rightChar = s[right] - 'A'
            freq[rightChar]++
            maxFreq = maxOf(maxFreq, freq[rightChar])

            while (right - left + 1 - maxFreq > k) {
                val leftChar = s[left] - 'A'
                freq[leftChar]--
                left++
                maxFreq = freq.maxOrNull() ?: 0
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}