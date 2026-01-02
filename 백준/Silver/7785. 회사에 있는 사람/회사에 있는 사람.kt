/**
 * p7785 회사에 있는 사람
 */
fun main() {
    val set = hashSetOf<String>()
    repeat(readln().toInt()) {
        val (name, action) = readln().split(" ")
        if (action == "enter") set.add(name)
        else set.remove(name)
    }

    set.sortedDescending().forEach(::println)
}