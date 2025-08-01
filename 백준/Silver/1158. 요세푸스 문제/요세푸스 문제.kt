/**
 * p1158 요세푸스 문제
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    val queue = ArrayDeque<Int>()
    val result = mutableListOf<Int>()

    for (i in 1 .. n) {
        queue.add(i)
    }

    while (queue.isNotEmpty()) {
        repeat(k-1) {
            queue.add(queue.removeFirst())
        }
        result.add(queue.removeFirst())
    }

    println("<${result.joinToString(", ") }>")
}