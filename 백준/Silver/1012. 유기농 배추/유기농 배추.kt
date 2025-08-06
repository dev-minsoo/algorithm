/**
 * p1012 유기농 배추
 */
val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)

fun isValid(x: Int, y: Int, n: Int, m: Int): Boolean {
    return x in 0 until n && y in 0 until m
}

fun dfs(x: Int, y: Int, graph: Array<IntArray>) {
    graph[x][y] = 2
    repeat(4) { i ->
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (isValid(nx, ny, graph.size, graph[0].size)) {
            if (graph[nx][ny] == 1) {
                dfs(nx, ny, graph)
            }
        }
    }
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val graph = Array(n) { IntArray(m) }
        var result = 0

        repeat(k) {
            val (y, x) = readln().split(" ").map { it.toInt() }
            graph[x][y] = 1
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (graph[i][j] == 1) {
                    result++
                    dfs(i, j, graph)
                }
            }
        }

        println(result)
    }
}