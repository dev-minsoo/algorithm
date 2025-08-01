import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int>()
    val sb = StringBuilder()

    var current = 1
    var possible = true

    repeat(n) {
        val target = readln().toInt()

        while (current <= target) {
            stack.push(current++)
            sb.appendLine("+")
        }

        if (stack.peek() == target) {
            stack.pop()
            sb.appendLine("-")
        } else {
            possible = false
            return@repeat
        }
    }

    if (possible) {
        println(sb)
    } else {
        println("NO")
    }

}