/**
 * p1316 그룹 단어 체커
 */
fun isGroupWord(word: String): Boolean {
    val visited = BooleanArray(26)
    var prev = word[0]
    visited[prev - 'a'] = true

    for (i in 1 until word.length) {
        val cur = word[i]
        if (cur != prev) {
            if (visited[cur - 'a']) return false
            visited[cur - 'a'] = true
            prev = cur
        }
    }
    return true
}

fun main() {
    var result = 0

    repeat(readln().toInt()) {
        if (isGroupWord(readln())) result++
    }

    println(result)
}