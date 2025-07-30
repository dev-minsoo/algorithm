class Solution {
    fun solution(n: Int): Int {
        var num = n
        var answer = 0
        
        while (true) {
            answer += num % 10
            if (num < 10) break
            num /= 10
        }

        return answer
    }
}