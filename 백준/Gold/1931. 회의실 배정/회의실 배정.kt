/**
 * p1931 회의실 배정
 */
fun main() {
    val n = readln().toInt()
    val meetings = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        meetings.add(Pair(start, end))
    }

    meetings.sortWith(compareBy({it.second}, {it.first}))

    var count = 0
    var lastEndTime = 0

    for ((start, end) in meetings) {
        if (start >= lastEndTime) {
            count++
            lastEndTime = end
        }
    }

    print(count)
}