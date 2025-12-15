fun canInstall(houses: List<Int>, dist: Int, c: Int): Boolean {
    var installed = 1
    var lastPos = houses[0]

    for (i in 1 until houses.size) {
        if (houses[i] - lastPos >= dist) {
            installed++
            lastPos = houses[i]

            if (installed >= c) {
                return true
            }
        }
    }
    return installed >= c
}

fun main() {
    val (n, c) = readln().split(" ").map { it.toInt() }
    val houses = IntArray(n) { readln().toInt() }.sorted()

    var left = 1
    var right = houses.last() - houses.first()
    var answer = 0

    while (left <= right) {
        val mid = (left + right) / 2
        if (canInstall(houses, mid, c)) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    println(answer)
}