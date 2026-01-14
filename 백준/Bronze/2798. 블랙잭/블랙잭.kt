/**
 * p2798 블랙잭
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val cards = readln().split(" ").map { it.toInt() }

    var result = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                val sum = cards[i] + cards[j] + cards[k]
                if (sum == m) {
                    println(sum)
                    return
                }
                else if (sum <= m) result = maxOf(result, sum)
            }
        }
    }

    println(result)
}