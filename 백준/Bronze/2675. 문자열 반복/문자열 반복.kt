/**
 * p2675 문자열 반복
 */
fun main() {
    val sb = StringBuilder()
    repeat(readln().toInt()) {
        val (r, s) = readln().split(" ")
        for (c in s) {
            repeat(r.toInt()) {
                sb.append(c)
            }
        }
        sb.append("\n")
    }
    println(sb.toString())
}