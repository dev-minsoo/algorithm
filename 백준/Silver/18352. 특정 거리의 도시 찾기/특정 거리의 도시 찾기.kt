/**
 * p18352 특정 거리의 도시 찾기
 */
fun main() {
    val (n, m, k, x) = readln().split(" ").map { it.toInt() }

//    인접 리스트 및 방문 배열 초기화
    val graph = Array(n+1) { mutableListOf<Int>() }
    val visited = BooleanArray(n+1)

//    간선 정보 입력
    repeat(m) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        graph[start].add(end) // 단방향
    }

//    BFS Queue 초기화: Pair(현재 도시 번호, 현재 거리)
    val resultList = mutableListOf<Int>()
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(x to 0)
    visited[x] = true

    while (queue.isNotEmpty()) {
        val (current, distance) = queue.removeFirst()

        if (distance == k) {
            resultList.add(current)
        }

        for (next in graph[current]) {
            if (!visited[next]) {
                visited[next] = true
                queue.add(next to distance + 1)
            }
        }

    }

    if (resultList.isEmpty()) println(-1)
    else resultList.sorted().forEach { println(it) }
}