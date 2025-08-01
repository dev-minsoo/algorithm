import kotlin.math.pow

/**
 * p2909 캔디 구매
 */
fun main() {
    val (c, k) = readln().split(" ").map { it.toLong() }

    val unit = 10.0.pow(k.toDouble()).toLong()

    // 반올림 공식 활용
    val result = ((c + unit / 2) / unit) * unit

    println(result)
}