class Solution {
    fun countBinarySubstrings(s: String): Int {
        var result = 0
        var prev = 0
        var curr = 1

        for (i in 1 until s.length) {
            if (s[i] == s[i-1]) {
                curr++
            } else {
                result += minOf(prev, curr)
                prev = curr
                curr = 1
            }
        }
        result += minOf(prev, curr)
        return result
    }
}