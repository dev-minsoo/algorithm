class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val result = mutableListOf<Int>()
        if (s.length < p.length) return result

        val count = IntArray(26)

        for (c in p) {
            count[c - 'a']++
        }

        var left = 0
        var right = 0
        var remaining = p.length

        while (right < s.length) {
            val r = s[right] - 'a'

            if (count[r] > 0) remaining--
            count[r]--
            right++

            if (right - left == p.length) {
                if (remaining == 0) {
                    result.add(left)
                }

                val l = s[left] - 'a'

                if (count[l] >= 0) remaining++
                count[l]++
                left++
            }

        }

        return result
    }
}