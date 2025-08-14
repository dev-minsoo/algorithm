fun main() {
    val n = readln().toInt()
    repeat(n) {
        println("@".repeat(n*5))
    }
    repeat(n*3) {
        println("@".repeat(n))
    }
    repeat(n) {
        println("@".repeat(n*5))
    }
}