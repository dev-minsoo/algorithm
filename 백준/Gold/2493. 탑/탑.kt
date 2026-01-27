/**
 * p2493 탑
 */
fun main() {
    val n = readln().toInt()
    val towers = readln().split(" ").map { it.toInt() }
    val stack = ArrayDeque<Pair<Int, Int>>()
    val result = mutableListOf<Int>()

    for (i in towers.indices) {
        val current = towers[i]

        while (stack.isNotEmpty() && stack.last().second < current) {
            stack.removeLast()
        }

        if (stack.isEmpty()) {
            result.add(0)
        } else {
            result.add(stack.last().first + 1)
        }

        stack.addLast(i to current)
    }

    println(result.joinToString(" "))
}