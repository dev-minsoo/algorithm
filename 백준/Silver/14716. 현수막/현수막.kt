val dirs = arrayOf(1 to 1, 1 to -1, -1 to 1, -1 to -1, 1 to 0, -1 to 0, 0 to 1, 0 to -1)

fun isValid (x: Int, y: Int, graph: Array<IntArray>): Boolean =
    x in 0 until graph.size && y in 0 until graph[0].size

fun dfs (x: Int, y: Int, graph: Array<IntArray>) {
    graph[x][y] = 2

    for (dir in dirs) {
        val nx = x + dir.first
        val ny = y + dir.second
        if (isValid(nx, ny, graph) && graph[nx][ny] == 1) {
            dfs(nx, ny, graph)
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    var result = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (graph[i][j] == 1) {
                dfs(i, j, graph)
                result++
            }
        }
    }

    println(result)
}