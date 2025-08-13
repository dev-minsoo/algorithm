/**
 * p2805 나무 자르기
 */
fun canEnoughTree(trees: IntArray, length: Long, m: Int): Boolean {
    var count = 0L
    for (tree in trees) {
        if (tree > length) {
            count += tree - length
        }
        if (count >= m) {
            return true
        }
    }
    return false
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val trees = readln().split(" ").map { it.toInt() }.toIntArray()

    var left = 1L
    var right = trees.max().toLong()
    var answer = 0L
    while (left <= right) {
        val mid = (left + right) / 2
        if (canEnoughTree(trees, mid, m)) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    println(answer)
}