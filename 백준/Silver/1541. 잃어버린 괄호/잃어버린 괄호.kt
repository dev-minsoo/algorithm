/**
 * p1541 잃어버린 괄호
 */
fun calculateSum(expression: String): Int {
    return expression.split("+").sumOf { it.toInt() }
}

fun main() {
    val input = readln()
    val parts = input.split("-")
    var result = calculateSum(parts[0])

    for (i in 1 until parts.size) {
        result -= calculateSum(parts[i])
    }

    print(result)
}