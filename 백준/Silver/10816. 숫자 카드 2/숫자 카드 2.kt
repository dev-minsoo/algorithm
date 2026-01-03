/**
 * p10816 숫자 카드 2
 */
fun main() {
    val n = readln().toInt()
    val cards = readln().split(" ").map { it.toInt() }

    val cardCountMap = hashMapOf<Int, Int>()
    cards.forEach { cardCountMap[it] = cardCountMap.getOrDefault(it, 0) + 1 }

    val m = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    println(
        numbers.joinToString(" ") {
            cardCountMap.getOrDefault(it, 0).toString()
        }
    )
}