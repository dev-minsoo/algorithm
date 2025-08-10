/**
 * p1697 숨바꼭질
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val visited = BooleanArray(100001)

    if (n == k) {
        println(0)
        return
    }

    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(Pair(n, 0))
    visited[n] = true

    while (queue.isNotEmpty()) {
        val (pos, time) = queue.removeFirst()
        val moves = arrayOf(pos - 1, pos + 1, pos * 2)

        for (next in moves) {
            if (next == k) {
                println(time + 1)
                return
            }

            if (next in 0 until 100001 && !visited[next]) {
                visited[next] = true
                queue.addLast(Pair(next, time+1))
            }
        }
    }

}