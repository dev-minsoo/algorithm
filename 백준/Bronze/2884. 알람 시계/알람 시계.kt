fun main() {
    val (h, m) = readln().split(" ").map { it.toInt() }
    if (m - 45 >= 0) {
        print("$h ${m-45}")
    } else {
        val newM = 60 - (45 - m)
        val newH = if (h-1 < 0) 24 - 1 else h - 1
        print("$newH $newM")
    }
}