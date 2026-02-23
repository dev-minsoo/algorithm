import kotlin.math.min

/**
 * p1018 체스판 다시 칠하기
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val board = Array(n) { readln().toCharArray() }
    var result = Int.MAX_VALUE

    for (r in 0 .. n-8) {
        for (c in 0 .. m-8) {
            var startW = 0
            var startB = 0

            for (i in 0 until 8) {
                for (j in 0 until 8) {
                    val current = board[r+i][c+j]
                    val isEven = (i+j) % 2 == 0

                    val expectedW = if (isEven) 'W' else 'B'
                    val expectedB = if (isEven) 'B' else 'W'

                    if (current != expectedW) startW++
                    if (current != expectedB) startB++
                }
            }

            result = min(result, min(startW, startB))
        }
    }

    println(result)
}