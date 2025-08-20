import java.math.BigInteger

fun main() {
    val (n, m) = readln().split(" ").map { BigInteger(it) }
    println(n / m)
    println(n % m)
}