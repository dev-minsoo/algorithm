/**
 * p11866 요세푸스 문제 0
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val queue = ArrayDeque<Int>()
    val result = mutableListOf<Int>()
    repeat(n) { queue.addLast(it + 1) }

    while (queue.isNotEmpty()) {
        repeat(k-1) {
            queue.addLast(queue.removeFirst())
        }
        result.add(queue.removeFirst())
    }

    println("<${result.joinToString(", ")}>")
}