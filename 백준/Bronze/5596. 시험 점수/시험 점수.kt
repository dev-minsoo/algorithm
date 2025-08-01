/**
* p5596 시험 점수
*/
fun main() {
    val s = readln().split(" ").sumOf { it.toInt() }
    val t = readln().split(" ").sumOf { it.toInt() }
    println(if (s >= t) s else t)
}