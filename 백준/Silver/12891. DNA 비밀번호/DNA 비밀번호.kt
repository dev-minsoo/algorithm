/**
 * p12891 DNA 비밀번호
 */
fun main() {
    val (s, p) = readln().split(" ").map { it.toInt() }
    val dnaString = readln()
    val dnaMinCount = readln().split(" ").map { it.toInt() } // A, C, G, T

    val dnaMap = hashMapOf<Char, Int>()
    for (i in 0 until p) {
        dnaMap[dnaString[i]] = dnaMap.getOrDefault(dnaString[i], 0) + 1
    }

    fun isValid() = dnaMap.getOrDefault('A', 0) >= dnaMinCount[0] &&
            dnaMap.getOrDefault('C', 0) >= dnaMinCount[1] &&
            dnaMap.getOrDefault('G', 0) >= dnaMinCount[2] &&
            dnaMap.getOrDefault('T', 0) >= dnaMinCount[3]

    var count = if (isValid()) 1 else 0

    for (i in p until s) {
        dnaMap[dnaString[i-p]] = dnaMap[dnaString[i-p]]!! - 1
        dnaMap[dnaString[i]] = dnaMap.getOrDefault(dnaString[i], 0) + 1

        if (isValid()) count++
    }

    println(count)
}