fun main() {
    val S = readln()
    val sb = StringBuilder()
    var inTag = false
    var result = ""

    for (c in S) {
        if (c == '<') {
            if (sb.isNotEmpty()) {
                if (sb.toString().elementAt(0) == ' ') {
                    result += ' ' + sb.toString().substring(1).reversed()
                } else {
                    result += sb.toString().reversed()
                }
                sb.clear()
            }
            inTag = true
            sb.append(c)
        } else if (c == '>') {
            sb.append(c)
            result += sb.toString()
            sb.clear()
            inTag = false
        } else if (c == ' ' && !inTag) {
            if (sb.toString().elementAt(0) == ' ') {
                result += ' ' + sb.toString().substring(1).reversed()
            } else {
                result += sb.toString().reversed()
            }
            sb.clear()
            sb.append(c)
        } else {
            sb.append(c)
        }

    }

    if (sb.isNotEmpty() && sb.toString().elementAt(0) == ' ') {
        result += ' ' + sb.toString().substring(1).reversed()
    } else {
        result += sb.toString().reversed()
    }

    println(result)
}