/**
 * p9019 DSLR
 */
fun bfs(start: Int, target: Int): String {
    if (start ==  target) return ""

    val queue = ArrayDeque<Pair<Int, String>>()
    val visited = BooleanArray(10000)

    queue.addLast(Pair(start, ""))
    visited[start] = true

    while (queue.isNotEmpty()) {
        val (num, commands) = queue.removeFirst()

        val operations = arrayOf(
            applyD(num) to "D",
            applyS(num) to "S",
            applyL(num) to "L",
            applyR(num) to "R",
        )

        for ((next, command) in operations) {
            if (next == target) {
                return commands + command
            }
            if (!visited[next]) {
                visited[next] = true
                queue.addLast(Pair(next, commands + command))
            }
        }
    }
    return ""
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        println(bfs(a, b))
    }
}

fun applyD(n: Int): Int = (n * 2) % 10000
fun applyS(n: Int): Int = if (n == 0) 9999 else n-1
fun applyL(n: Int): Int = (n % 1000) * 10 + n / 1000
fun applyR(n: Int): Int = (n % 10) * 1000 + n / 10
