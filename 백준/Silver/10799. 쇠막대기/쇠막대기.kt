import java.util.Stack

/**
* p10799 쇠막대기
*/
fun main() {
    val input = readln().replace("()", "*")
    val stack = Stack<Char>()

    var result = 0

    for (c in input) {
        when (c) {
            '*' -> result += stack.size
            '(' -> stack.push('(')
            ')' -> {
                result++
                stack.pop()
            }
        }
    }

    println(result)
}