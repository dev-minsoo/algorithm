fun main() {
    val deque = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val command = readln().split(" ")
        when (command[0]) {
            "push_front" -> deque.addFirst(command[1].toInt())
            "push_back" -> deque.addLast(command[1].toInt())
            "pop_front" -> println(deque.removeFirstOrNull() ?: -1)
            "pop_back" -> println(deque.removeLastOrNull() ?: -1)
            "size" -> println(deque.size)
            "empty" -> println(if (deque.isEmpty()) 1 else 0)
            "front" -> println(deque.firstOrNull() ?: -1)
            "back" -> println(deque.lastOrNull() ?: -1)
        }
    }
}