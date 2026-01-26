/**
 * p10773 제로
 */
fun main() {
    val stack = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val k = readln().toInt()
        if (k != 0) stack.addLast(k)
        else stack.removeLast()
    }

    println(stack.sum())
}
