/**
 * p9375 패션왕 신해빈
 */
fun main() {
    repeat(readln().toInt()) {
        val map = hashMapOf<String, Int>()
        var n = readln().toInt()

        repeat(n) {
            var type = readln().split(" ")[1]
            map[type] = map.getOrDefault(type, 0) + 1
        }

        var result = 1
        map.values.forEach { count -> result *= (count + 1) }

        println(result - 1)
    }
}
