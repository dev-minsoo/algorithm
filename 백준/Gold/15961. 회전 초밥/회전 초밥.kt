/**
 * p15961 회전 초밥
 */
fun main() {
    val (n, d, k, c) = readln().split(" ").map { it.toInt() }
    val sushiList = IntArray(n) { readln().toInt() }
    val sushiMap = hashMapOf<Int, Int>()

    for (i in 0 until k) {
        sushiMap[sushiList[i]] = sushiMap.getOrDefault(sushiList[i], 0) + 1
    }
    var maxSushi = if (c !in sushiMap) sushiMap.size + 1 else sushiMap.size

    for (i in 0 until n) {
        val addIdx = (i+k) % n

        sushiMap[sushiList[i]] = sushiMap[sushiList[i]]!! - 1
            if (sushiMap[sushiList[i]] == 0) sushiMap.remove(sushiList[i])

        sushiMap[sushiList[addIdx]] = sushiMap.getOrDefault(sushiList[addIdx], 0) + 1

        val currentMax = if (c !in sushiMap) sushiMap.size + 1 else sushiMap.size
        maxSushi = maxOf(maxSushi, currentMax)
    }

    println(maxSushi)
}