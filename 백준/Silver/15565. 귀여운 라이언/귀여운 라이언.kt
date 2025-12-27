/**
 * p15565 귀여운 라이언
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val dolls = readln().split(" ").map { it.toInt() }

    var left = 0
    var ryanCount = 0
    var minLength = Int.MAX_VALUE

    for (right in dolls.indices) {
        if (dolls[right] == 1) {
            ryanCount++
        }

        while (ryanCount >= k) {
            minLength = minOf(minLength, right-left+1)

            if (dolls[left] == 1) {
                ryanCount--
            }
            left++
        }
    }

    println(
        if (minLength == Int.MAX_VALUE) -1
        else minLength
    )
}