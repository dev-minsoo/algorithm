/**
 * p2178 미로 탐색
 */
val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

fun isValid(x: Int, y: Int, graph: Array<IntArray>): Boolean {
    return x in 0 until graph.size && y in 0 until graph[0].size
}

fun bfs(x: Int, y: Int, graph: Array<IntArray>, visited: Array<BooleanArray>) {
    val queue = ArrayDeque<Triple<Int, Int, Int>>()
    visited[x][y] = true
    queue.addLast(Triple(x, y, 1))

    while (queue.isNotEmpty()) {
        val (a, b, c) = queue.removeFirst()
        for (dir in dirs) {
            val nx = a + dir.first
            val ny = b + dir.second
            if (isValid(nx, ny, graph) && !visited[nx][ny] && graph[nx][ny] == 1) {
                graph[nx][ny] = c+1
                queue.addLast(Triple(nx, ny, c+1))
            }
        }
    }

}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt()}
    val graph = Array(n) { readln().map { it.digitToInt() }.toIntArray() }
    val visited = Array(n) { BooleanArray(m) }

    bfs(0, 0, graph, visited)

    println(graph[n-1][m-1])
}