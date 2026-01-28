/**
 * p2178 미로 탐색
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val grid = Array(n) { readln().map { it - '0' }.toIntArray() }

    val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)
    val queue = ArrayDeque<Pair<Int, Int>>()

    queue.add(0 to 0)
    grid[0][0] = 1  // 시작점 방문 처리

    while (queue.isNotEmpty()) {
        val (x, y) = queue.removeFirst()

        for ((dx, dy) in dirs) {
            val nx = x + dx
            val ny = y + dy

            if (nx in 0 until n && ny in 0 until m && grid[nx][ny] == 1) {
                grid[nx][ny] = grid[x][y] + 1
                queue.add(nx to ny)
            }
        }
    }

    println(grid[n - 1][m - 1])
}