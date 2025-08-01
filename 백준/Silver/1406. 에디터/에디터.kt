import java.util.Stack

/**
 * p1406 에디터
 */
fun main() {
    val input = readln()
    val m = readln().toInt()

    val left = Stack<Char>()
    val right = Stack<Char>()

    input.forEach { left.push(it)}
    
    repeat(m) {
        val command = readln().split(" ")
        when (command[0]) {
            "L" -> if (left.isNotEmpty()) right.push(left.pop())
            "D" -> if (right.isNotEmpty()) left.push(right.pop())
            "B" -> if (left.isNotEmpty()) left.pop()
            "P" -> left.push(command[1][0])
        }
    }

    val result = StringBuilder()
    left.forEach { result.append(it) }
    right.reversed().forEach { result.append(it) }
    println(result)
}