/**
 * p1260 DFS와 BFS
 */
fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    val graph = Array(n+1) { mutableListOf<Int>() }
    var visited = BooleanArray(n+1)
    val dfsResult = mutableListOf<Int>()
    val bfsResult = mutableListOf<Int>()

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    for (i in 1..n) {
        graph[i].sort()
    }

    fun dfs(node: Int) {
        visited[node] = true
        dfsResult.add(node)
        for (next in graph[node]) {
            if (!visited[next]) {
                dfs(next)
            }
        }
    }

    fun bfs(start: Int) {
        val queue = ArrayDeque<Int>()
        visited[start] = true
        queue.add(start)
        queue.first()

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            bfsResult.add(node)

            for (next in graph[node]) {
                if (!visited[next]) {
                    visited[next] = true
                    queue.add(next)
                }
            }
        }
    }

    dfs(v)
    visited = BooleanArray(n+1)
    bfs(v)


    println(dfsResult.joinToString(" "))
    println(bfsResult.joinToString(" "))
}