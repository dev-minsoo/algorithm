class Solution {
    fun solution(numbers: IntArray, target: Int): Int {       
        
        fun dfs(index: Int, sum: Int): Int {
            if (index == numbers.size) {
                return if (sum == target) 1 else 0
            }
            
            return dfs(index+1, sum + numbers[index]) + dfs(index+1, sum - numbers[index])
        }
        
        return dfs(0, 0)
    }
}