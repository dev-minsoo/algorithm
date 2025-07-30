import java.util.Stack

/**
 * p9012 괄호
 */
fun main() {
    val T = readln().toInt()
    val stack = Stack<Char>()

    repeat(T) {
        var answer = "YES"
        stack.clear()

        val line = readln()
        for (c in line) {
            if (c == '(') {
                stack.push(c)
            }
            else {
                if (stack.size > 0) {
                    stack.pop()
                }
                else {
                    answer = "NO"
                }
            }
        }
        if (stack.isNotEmpty()) {
            answer = "NO"
        }
        println(answer)
    }

}