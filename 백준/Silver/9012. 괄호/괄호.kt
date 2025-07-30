/**
 * p9012 괄호
 */
fun main() {
    val T = readln().toInt()

    repeat(T) {
        val line = readln()
        var count = 0
        var isValid = true

        for (c in line) {
            if (c == '(') {
                count++
            } else {
                count--
                if (count < 0) {
                    isValid = false
                    break  // early break
                }
            }
        }

        println(if (isValid && count == 0) "YES" else "NO")
    }
}