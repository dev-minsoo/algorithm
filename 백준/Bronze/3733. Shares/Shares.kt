import java.util.Scanner

/**
 * p3733 Shares
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val sb = StringBuilder()

    while (scanner.hasNext()) {
        try {
            val n = scanner.nextInt()
            val s = scanner.nextInt()
            sb.appendLine(s / (n+1))
        } catch (e: Exception) {
            break
        }
    }

    println(sb)
}
