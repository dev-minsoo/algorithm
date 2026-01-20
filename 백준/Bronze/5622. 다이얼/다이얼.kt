/**
 * p5622 다이얼
 */
fun main() {
    val alphabet = readln()
    var result = 0

    for (c in alphabet) {
        result += when (c) {
            in 'A'..'C' -> 3
            in 'D'..'F' -> 4
            in 'G'..'I' -> 5
            in 'J'..'L' -> 6
            in 'M'..'O' -> 7
            in 'P'..'S' -> 8
            in 'T'..'V' -> 9
            else -> 10
        }
    }

    println(result)
}