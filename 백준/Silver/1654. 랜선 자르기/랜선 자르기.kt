/**
 * p1654 랜선 자르기
 */
fun canMake(cables: IntArray, length: Long, n: Int): Boolean {
    var count = 0L
    for (cable in cables) {
        count += cable / length
        if (count >= n) {
            return true
        }
    }
    return false
}


fun main() {
    val (k, n) = readln().split(" ").map { it.toInt() }
    val cables = IntArray(k) { readln().toInt() }

    var left = 1L
    var right = cables.max().toLong()
    var result = 0L
    while (left <= right) {
        val mid = (left + right) / 2
        if (canMake(cables, mid, n)) {
            result = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    println(result)
}