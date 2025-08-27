class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val visited = BooleanArray(n)
        var count = 0
        
        for (i in 0 until n) {
            if (!visited[i]) {
                val queue = ArrayDeque<Int>()
                queue.add(i)
                visited[i] = true
                
                while(queue.isNotEmpty()) {
                    val current = queue.removeFirst()
                    for (j in 0 until n) {
                        if (computers[current][j] == 1 && !visited[j]) {
                            queue.addLast(j)
                            visited[j] = true
                        }
                    }
                }
                count++
            }
        }
        
        return count
    }
}