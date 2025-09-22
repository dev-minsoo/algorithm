/**
 * p10986 나머지 합
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }

    // 나머지별 개수를 저장하는 배열
    val remainderCount = LongArray(m)
    remainderCount[0] = 1  // prefixSum[0] = 0의 나머지는 0

    var prefixSum = 0L
    var result = 0L

    // O(N) - 한 번의 순회로 해결
    for (i in 0 until n) {
        prefixSum += array[i]
        val remainder = ((prefixSum % m) + m) % m  // 음수 나머지 처리

        // 같은 나머지를 가진 이전 구간들과 조합
        result += remainderCount[remainder.toInt()]
        remainderCount[remainder.toInt()]++
    }

    println(result)
}