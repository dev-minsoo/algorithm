/**
 * p1157 단어 공부
 */
fun main() {
    val s = readln().uppercase()
    val countMap = hashMapOf<Char, Int>()

    s.forEach { c ->
        countMap[c] = countMap.getOrDefault(c, 0) + 1
    }

    val maxCount = countMap.values.max()
    val maxChars = countMap.filterValues { it == maxCount }

    if (maxChars.size > 1) println("?")
    else println(maxChars.keys.first())
}