/**
 * p7891 Can you add this?
 */
fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()

    repeat(t) {
        sb.appendLine(readln().split(" ").sumOf { it.toInt() })
    }

    println(sb)
}
