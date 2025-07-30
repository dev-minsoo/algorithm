/**
 * p9093 단어 뒤집기
 */
fun main() {
    val T = readln().toInt()

    repeat(T) {
        println(readln().split(" ").joinToString(" ") { it.reversed() })
    }
}
