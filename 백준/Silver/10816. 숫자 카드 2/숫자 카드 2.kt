/**
 * p10816 숫자 카드 2
 */
fun main() {
    val n = readln().toInt()
    val cards = readln().split(" ").map { it.toInt() }

    val countMap = mutableMapOf<Int, Int>()
    for (card in cards) {
        countMap[card] = countMap.getOrDefault(card, 0) + 1
    }

    val m = readln().toInt()
    val queries = readln().split(" ").map { it.toInt() }

    val result = queries.map { countMap.getOrDefault(it, 0) }
    println(result.joinToString(" "))
}