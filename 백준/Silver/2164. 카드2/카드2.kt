/**
 * p2164 카드2
 */
fun main() {
    val queue = ArrayDeque<Int>()
    repeat(readln().toInt()) { i -> queue.addLast(i+1) }

    while (queue.size > 1) {
        queue.removeFirst()
        queue.addLast(queue.removeFirst())
    }

    println(queue.removeFirst())
}