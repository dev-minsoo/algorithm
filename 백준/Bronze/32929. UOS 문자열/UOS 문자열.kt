/**
 * p32929 UOS 문자열
 */
fun main() {
    val x = readln().toInt()
    when (x%3) {
        0 -> println("S")
        1 -> println("U")
        2 -> println("O")
    }
}