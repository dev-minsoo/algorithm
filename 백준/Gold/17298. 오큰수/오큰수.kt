import java.util.Stack

/**
 * p17298 오큰수
 */
fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    val result = IntArray(n) { -1 }
    val stack = Stack<Int>()

    for (i in 0 until n) {
        while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
            val idx = stack.pop()
            result[idx] = numbers[i]
        }
        stack.push(i)
    }

    println(result.joinToString(" "))
}