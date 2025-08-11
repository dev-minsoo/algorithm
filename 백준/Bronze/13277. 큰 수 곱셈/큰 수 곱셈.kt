import java.math.BigInteger

/**
 * p13277 큰 수 곱셈
 */
fun main() {
    val (a, b) = readln().split(" ").map { BigInteger(it) }
    println(a*b)
}