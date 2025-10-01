/**
 * p10026 적록색약
 */
val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

fun countAreas(graph: Array<CharArray>): Int {
    val n = graph.size
    val visited = Array(n) { BooleanArray(n) }
    var count = 0

    fun dfs(x: Int, y: Int) {
        visited[x][y] = true

        for (dir in dirs) {
            val nx = x + dir.first
            val ny = y + dir.second
            if (nx in 0 until graph.size
                && ny in 0 until graph.size
                && !visited[nx][ny]
                && graph[nx][ny] == graph[x][y]) {
                dfs(nx, ny)
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j]) {
                dfs(i, j)
                count++
            }
        }
    }

    return count
}

fun main() {
    val n = readln().toInt()
    var graph = Array(n) { readln().toCharArray() }

    val result = mutableListOf<Int>()
    result.add(countAreas(graph))

    graph = graph.map { row -> String(row).replace('G', 'R').toCharArray() }.toTypedArray()
    result.add(countAreas(graph))

    println(result.joinToString(" "))
}