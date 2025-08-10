/**
 * p7576 토마토
 */
fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val tomato = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }
    val queue = ArrayDeque<Triple<Int, Int, Int>>()
    var zeroCount = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            when (tomato[i][j]) {
                0 -> zeroCount++
                1 -> queue.addLast(Triple(i, j, 0))
            }
        }
    }

    if (zeroCount == 0) {
        println(0)
        return
    }

    val dirs = arrayOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)
    var maxTime = 0
    while (queue.isNotEmpty()) {
        val (x, y, time) = queue.removeFirst()
        for (dir in dirs) {
            val nx = x + dir.first
            val ny = y + dir.second
            if (nx in 0 until n && ny in 0 until m && tomato[nx][ny] == 0) {
                tomato[nx][ny] = 1
                zeroCount--
                queue.addLast(Triple(nx, ny, time+1))
                maxTime = time + 1
            }
        }
    }

    println(if (zeroCount == 0) maxTime else -1)
}