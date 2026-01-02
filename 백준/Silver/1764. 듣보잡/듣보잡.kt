/**
 * p1764 듣보잡
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val notHeard = hashSetOf<String>()
    repeat(n) {
        notHeard.add(readln())
    }
    var result = mutableListOf<String>()
    repeat(m) {
        val name = readln()
        if (name in notHeard) result.add(name)
    }
    result.sort()
    println(result.size)
    result.forEach(::println)
}