/**
 * p11724 연결 요소의 개수
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n+1) { mutableListOf<Int>() }
    val visited = BooleanArray(n+1)
    var result = 0

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    for (i in 1..n) {
        if (!visited[i]) {
            result++
            dfs(i, graph, visited)
        }
    }

    println(result)
}

fun dfs(node: Int, graph: Array<MutableList<Int>>, visited: BooleanArray) {
    visited[node] = true
    for (next in graph[node]) {
        if (!visited[next]) {
            dfs(next, graph, visited)
        }
    }
}