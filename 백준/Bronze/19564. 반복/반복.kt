fun main() {
    val input = readln()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] <= input[i-1]) {
            count++
        }
    }

    println(count)
}