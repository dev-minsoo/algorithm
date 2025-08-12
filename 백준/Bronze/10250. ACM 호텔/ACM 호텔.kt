fun main() {
    repeat(readln().toInt()) {
        val (h, w, n) = readln().split(" ").map { it.toInt() }

        val floor = if (n % h == 0) h else n % h
        val room = (n - 1) / h + 1

        val roomNumber = floor * 100 + room

        println(roomNumber)
    }
}