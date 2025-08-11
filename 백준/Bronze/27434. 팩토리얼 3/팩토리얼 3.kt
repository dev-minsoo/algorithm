import java.math.BigInteger

/**
 * p27434 팩토리얼 3
 */
fun main() {
    val n = readln().toInt()
    println(factorial(1, n))
}

fun factorial(start: Int, end: Int): BigInteger {
    if (start > end) return BigInteger.ONE
    if (start == end) return BigInteger.valueOf(start.toLong())
    if (end - start == 1) {
        return BigInteger.valueOf(start.toLong()) * BigInteger.valueOf(end.toLong())
    }

    val mid = (start + end) / 2
    return factorial(start, mid) * factorial(mid + 1, end)
}