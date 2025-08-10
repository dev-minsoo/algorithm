/**
 * p2667 단지번호붙이기
 */
val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

fun dfs(x: Int, y: Int, graph: Array<IntArray>): Int {
    graph[x][y] = 2
    var count = 1

    for (dir in dirs) {
        val nx = x + dir.first
        val ny = y + dir.second
        if (nx in 0 until graph.size && ny in 0 until graph.size && graph[nx][ny] == 1) {
            count += dfs(nx, ny, graph)
        }
    }

    return count
}

fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().map { it.digitToInt() }.toIntArray() }
    val resultList = mutableListOf<Int>()

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (graph[i][j] == 1) {
                resultList.add(dfs(i, j, graph))
            }
        }
    }

    println(resultList.size)
    resultList.sort()
    resultList.forEach { println(it) }
}