/**
 * p2941 크로아티아 알파벳
 */
fun main() {
    val alphabetMappingList = listOf<String>("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = readln()
    var count = 0

    for (alphabet in alphabetMappingList) {
        while (input.contains(alphabet)) {
            count++
            input = input.replaceFirst(alphabet, "0")
        }
    }

    count += input.count { it != '0' }

    println(count)
}