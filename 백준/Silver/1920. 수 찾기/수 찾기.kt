/**
 * p1920 수 찾기
 */
fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toSet()
    val m = readln().toInt()
    val targets = readln().split(" ").map { it.toInt() }

    for (target in targets) {
        if (target in a) {
            println(1)
        } else {
            println(0)
        }
    }
}