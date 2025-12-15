class Solution {
    fun canProcess(times: IntArray, time: Long): Long {
        var count = 0L
        for (t in times) {
            count += time / t
            if (count >= 1_000_000_000L) {
                return count
            }
        }
        return count
    }
    
    fun solution(n: Int, times: IntArray): Long {
        var left = 1L
        var right = times.maxOrNull()!!.toLong() * n
        var answer = right
        
        while (left <= right) {
            val mid = (left + right) / 2
            
            val count = canProcess(times, mid)
            
            if (count >= n) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        
        return answer
    }
}