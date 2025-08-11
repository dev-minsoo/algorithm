/**
 * p11800 Tawla
 */
fun print(case: Int, sb: StringBuilder) {
    println("Case ${case}: " + sb.toString())
    sb.clear()
}

fun singleNickname(num: Int): String {
    return when (num) {
        1 -> "Yakk"
        2 -> "Doh"
        3 -> "Seh"
        4 -> "Ghar"
        5 -> "Bang"
        else -> "Sheesh"
    }
}

fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    for (i in 1..t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        if (a == b) {
            when (a) {
                1 -> sb.append("Habb Yakk")
                2 -> sb.append("Dobara")
                3 -> sb.append("Dousa")
                4 -> sb.append("Dorgy")
                5 -> sb.append("Dabash")
                6 -> sb.append("Dosh")
            }
            print(i, sb)
        } else {
            val big = maxOf(a, b)
            val small = minOf(a, b)
            if (big == 6 && small == 5) {
                sb.append("Sheesh Beesh")
                print(i, sb)
            } else {
                sb.append("${singleNickname(big)} ${singleNickname(small)}")
                print(i, sb)
            }
        }
    }
}