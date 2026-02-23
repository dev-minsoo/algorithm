/**
 * p7568 덩치
 */
fun main() {
    val people = Array(readln().toInt()) { readln().split(" ").map { it.toInt() } }
    val result = mutableListOf<Int>()

    for (i in 0 until people.size) {
        var rank = 1
        for (j in 0 until people.size) {
            if (i == j) continue
            if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) rank++
        }
        result.add(rank)
    }

    println(result.joinToString(" "))
}