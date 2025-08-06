/**
 * p2606 바이러스
 */
fun main() {
    val n = readln().toInt()
    val m = readln().toInt()

    val graph = Array(n+1) { mutableListOf<Int>() }
    val visited = BooleanArray(n+1)

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    fun dfs(node: Int): Int {
        visited[node] = true
        var count = 1

        for (next in graph[node]) {
            if (!visited[next]) {
                count += dfs(next)
            }
        }

        return count
    }

    val result = dfs(1) - 1
    println(result)
}