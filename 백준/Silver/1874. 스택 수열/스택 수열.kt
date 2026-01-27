/**
 * p1874 스택 수열
 */
fun main() {
    val n = readln().toInt()
    val stack = ArrayDeque<Int>()
    val sb = StringBuilder()
    var cur = 1
    var possible = true

    repeat(n) {
        val number = readln().toInt()

        while (cur <= number) {
            stack.addLast(cur++)
            sb.append("+\n")
        }

        if (stack.last() == number) {
            stack.removeLast()
            sb.append("-\n")
        } else {
            possible = false
        }
    }

    println(if (possible) sb else "NO")
}