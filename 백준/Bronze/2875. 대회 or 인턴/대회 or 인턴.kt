/**
 * p2875 대회 or 인턴
 */
fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val maxTeamW = n / 2
    val maxTeamM = m
    val maxTeamI = (n + m - k) / 3
    println(minOf(maxTeamW, maxTeamM, maxTeamI))
}