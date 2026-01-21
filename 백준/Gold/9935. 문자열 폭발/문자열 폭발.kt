fun main() {
    val word = readln()
    val bomb = readln()
    val stack = StringBuilder()

    for (c in word) {
        stack.append(c)

        if (stack.length >= bomb.length &&
            stack.substring(stack.length - bomb.length) == bomb) {
            repeat(bomb.length) {
                stack.deleteCharAt(stack.length - 1)
            }
        }
    }

    println(stack.ifEmpty { "FRULA" })
}