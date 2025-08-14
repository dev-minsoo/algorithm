fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val (c, d) = readln().split(" ").map { it.toInt() }
    
    val case1 = b + c
    val case2 = a + d
    
    print(minOf(case1, case2))
}