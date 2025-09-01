/**
 * p21736 헌내기는 친구가 필요해
 */
fun bfs(x: Int, y: Int, graph: Array<CharArray>, visited: Array<BooleanArray>): Int {
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(x to y)
    visited[x][y] = true
    var count = 0

    val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        for (dir in dirs) {
            val nx = current.first + dir.first
            val ny = current.second + dir.second
            if (nx in graph.indices && ny in graph[0].indices && !visited[nx][ny] && graph[nx][ny] != 'X') {
                visited[nx][ny] = true
                queue.addLast(nx to ny)
                if (graph[nx][ny] == 'P') {
                    count++
                }
            }
        }
    }

    return count
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().toCharArray() }
    val visited = Array(n) { BooleanArray(m) }
    var result = 0

    outer@ for (i in graph.indices) {
        for (j in graph[0].indices) {
            if (graph[i][j] == 'I') {
                result = bfs(i, j, graph, visited)
                break@outer
            }
        }
    }

    when (result) {
        0 -> println("TT")
        else -> println(result)
    }
}