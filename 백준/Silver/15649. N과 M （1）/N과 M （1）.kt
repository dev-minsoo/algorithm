/**
 * p15649 N과 M(1)
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()
    val visited = BooleanArray(n+1)

    fun backtrack(depth: Int) {
        if (depth == m) {
            println(result.joinToString(" "))
            return
        }

        for (i in 1..n) {
            if (!visited[i]) {
                visited[i] = true
                result.add(i)

                backtrack(depth + 1)

                visited[i] = false
                result.removeLast()
            }
        }
    }

    backtrack(0)
}