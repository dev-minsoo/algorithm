fun main() {
    val input = "SciComLove"
    var n = readln().toInt()

    n = if (n % 2 == 1) 1 else 0
    print(if (n == 0) input else input.reversed())
}