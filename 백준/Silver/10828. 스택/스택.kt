import java.util.Stack

/**
 * p10828 스택
 */
fun main() {
    val stack = Stack<Int>()
    val n = readln().toInt()

    for (i in 0 until n) {
        val command = readln().split(" ")
        when (command[0]) {
            "push" -> {
                stack.add(command[1].toInt())
            }
            "pop" -> {
                println(if (stack.isEmpty()) -1 else stack.pop())
            }
            "size" -> {
                println(stack.size)
            }
            "empty" -> {
                println(if (stack.isEmpty()) 1 else 0)
            }
            "top" -> {
                println(if (stack.isEmpty()) -1 else stack.peek())
            }
        }
    }
}