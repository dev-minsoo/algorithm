class Solution {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        
        var currentCount = s.take(k).count { it in vowels }
        var maxCount = currentCount

        for (i in k until s.length) {
            if (s[i-k] in vowels) currentCount--
            if (s[i] in vowels) currentCount++

            maxCount = maxOf(maxCount, currentCount)
        }

        return maxCount
    }
}