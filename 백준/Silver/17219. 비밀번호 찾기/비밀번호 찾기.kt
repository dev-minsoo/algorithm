/**
 * p17219 비밀번호 찾기
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = hashMapOf<String, String>()
    repeat(n) {
        val (url, password) = readln().split(" ")
        map[url] = password
    }
    repeat(m) {
        println(map[readln()])
    }
}