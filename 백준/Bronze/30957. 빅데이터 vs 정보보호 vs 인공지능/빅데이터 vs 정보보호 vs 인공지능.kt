fun main() {
    val n = readln().toInt()
    val s = readln()
    val counts = mapOf(
        'B' to s.count() { it == 'B'},
        'S' to s.count() { it == 'S'},
        'A' to s.count() { it == 'A'},
    )

    val maxCount = counts.values.max()
    val winners = listOf('B', 'S', 'A').filter { counts[it] == maxCount }

    val result = when {
        winners.size == 1 -> winners.first().toString()
        winners.size == 2 -> winners.joinToString("")
        else -> "SCU"
    }
    println(result)
}