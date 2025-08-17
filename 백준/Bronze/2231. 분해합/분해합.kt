/**
 * p2231 분해합
 */
fun getDigitSum(n: Int): Int {
    var num = n
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}

fun main() {
    val n = readln().toInt()

    val digits = n.toString().length
    val start = n - 9 * digits

    for (i in start until n) {
        val sum = i + getDigitSum(i)
        if (sum == n) {
            print(i)
            return
        }
    }
    print(0)
}