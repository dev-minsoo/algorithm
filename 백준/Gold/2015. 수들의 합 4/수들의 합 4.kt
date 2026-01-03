/**
 * p2015 수들의 합 4
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }

    val prefixCount = hashMapOf<Long, Long>()
    prefixCount[0] = 1

    var sum = 0L
    var answer = 0L

    for (number in array) {
        sum += number
        answer += prefixCount.getOrDefault(sum - k, 0)
        prefixCount[sum] = prefixCount.getOrDefault(sum, 0 ) + 1
    }

    println(answer)
}