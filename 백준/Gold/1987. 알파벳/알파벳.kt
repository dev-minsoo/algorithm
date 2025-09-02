/**
 * p1987 알파벳
 */
fun dfs(x: Int, y: Int, count: Int, grid: Array<CharArray>, visited: BooleanArray): Int {
    var maxCount = count

    val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    for ((dx, dy) in dirs) {
        val nx = x + dx
        val ny = y + dy
        if (nx in 0 until grid.size && ny in 0 until grid[0].size) {
            val idx = grid[nx][ny] - 'A'
            if (!visited[idx]) {
                visited[idx] = true
                maxCount = maxOf(maxCount, dfs(nx, ny, count+1, grid, visited))
                visited[idx] = false
            }
        }
    }

    return maxCount
}

fun main() {
    val (r, c) = readln().split(" ").map { it.toInt() }
    val grid = Array(r) { readln().toCharArray() }
    val visited = BooleanArray(26)

    visited[grid[0][0] - 'A'] = true
    val maxCount = dfs(0, 0, 1, grid, visited)
    println(maxCount)
}
