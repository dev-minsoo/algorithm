/**
 * p1012 유기농 배추
 */
val dirs = arrayOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)

fun isValid(graph: Array<IntArray>, x: Int, y: Int): Boolean =
    x in graph.indices && y in graph[0].indices


fun dfs(graph: Array<IntArray>, x: Int, y: Int) {
    graph[x][y] = 2

    for (dir in dirs) {
        val nx = x + dir.first
        val ny = y + dir.second
        if (isValid(graph, nx, ny) && graph[nx][ny] == 1) {
            dfs(graph, nx, ny)
        }
    }
}

fun main() {
    repeat(readln().toInt()) {
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val graph = Array(m) { IntArray(n) }
        var result = 0

        repeat(k) {
            val (x, y) = readln().split(" ").map { it.toInt() }
            graph[x][y] = 1
        }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (graph[i][j] == 1) {
                    result++
                    dfs(graph, i, j)
                }
            }
        }

        println(result)
    }
}