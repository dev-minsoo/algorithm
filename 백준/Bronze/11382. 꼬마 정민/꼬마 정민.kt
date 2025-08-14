import java.math.BigInteger

fun main() {
    print(readln().split(" ").sumOf { BigInteger(it) })
}