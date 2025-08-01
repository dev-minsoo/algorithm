fun main() {
    val queue = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val command = readln().split(" ")
        when (command[0]) {
            "push" -> queue.add(command[1].toInt())
            "pop" -> println(queue.removeFirstOrNull() ?: -1)
            "size" -> println(queue.size)
            "empty" -> println(if (queue.isEmpty()) 1 else 0)
            "front" -> println(queue.firstOrNull() ?: -1)
            "back" -> println(queue.lastOrNull() ?: -1)
        }
    }
}