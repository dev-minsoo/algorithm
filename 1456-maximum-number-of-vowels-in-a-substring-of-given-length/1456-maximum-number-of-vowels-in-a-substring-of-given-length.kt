class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val set = setOf('a', 'e', 'i', 'o', 'u')
        var currentCount = s.take(k).count { it in set }
        var maxCount = currentCount

        for (i in k until s.length) {
            if (s[i-k] in set) currentCount--
            if (s[i] in set) currentCount++

            maxCount = maxOf(maxCount, currentCount)
        }
        
        return maxCount
    }
}