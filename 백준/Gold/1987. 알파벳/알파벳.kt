/**
 * p1987 알파벳
 */
private fun dfs(x: Int, y: Int, count: Int, graph: Array<CharArray>, visited: BooleanArray): Int {
    var maxCount = count
    val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    for (dir in dirs) {
        val nx = x + dir.first
        val ny = y + dir.second
        if (nx in graph.indices && ny in graph[0].indices) {
            val idx = graph[nx][ny] - 'A'
            if (!visited[idx]) {
                visited[idx] = true
                maxCount = maxOf(maxCount, dfs(nx, ny, count + 1, graph, visited))
                visited[idx] = false
            }
        }
    }

    return maxCount
}

fun main() {
    val (r, c) = readln().split(" ").map { it.toInt() }
    val graph = Array(r) { readln().toCharArray() }
    val visited = BooleanArray(26)

    visited[graph[0][0] - 'A'] = true
    val result = dfs(0, 0, 1, graph, visited)

    println(result)
}