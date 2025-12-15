/**
 * p1939 중량제한
 */
fun canReach(graph: Array<MutableList<Pair<Int,Int>>>, n: Int, start: Int, end: Int, weight: Int): Boolean {
    val visited = BooleanArray(n+1)
    val queue = ArrayDeque<Int>()
    queue.addLast(start)
    visited[start] = true

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        if (current == end) {
            return true
        }

        for ((next, bridgeWeight) in graph[current]) {
            if (!visited[next] && bridgeWeight >= weight) {
                visited[next] = true
                queue.addLast(next)
            }
        }
    }

    return false
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n+1) { mutableListOf<Pair<Int, Int>>() }
    var maxWeight = 0

    repeat(m) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        graph[a].add(b to c)
        graph[b].add(a to c)
        maxWeight = maxOf(maxWeight, c)
    }

    val (start, end) = readln().split(" ").map { it.toInt() }

    var left = 1
    var right = maxWeight
    var answer = 0

    while (left <= right) {
        val mid = (left + right) / 2
        if (canReach(graph, n, start, end, mid)) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    println(answer)
}