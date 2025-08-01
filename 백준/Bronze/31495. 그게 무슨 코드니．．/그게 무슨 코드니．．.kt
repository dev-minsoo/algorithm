/**
 * p31495 그게 무슨 코드니..
 */
fun main() {
    val input = readln()
    input.also {
        if (it[0] != '"' || it[it.lastIndex] != '\"' || it.length <= 2) {
            println("CE")
        } else {
            println(it.substring(1, it.lastIndex))
        }
    }
}