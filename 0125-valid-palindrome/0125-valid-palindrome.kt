class Solution {
    fun isPalindrome(s: String): Boolean {
        val filteredString = s.filter { it.isLetterOrDigit() }.lowercase()
        return filteredString == filteredString.reversed()
    }
}