/**
 * p13305 주유소
 */
fun main() {
    val n = readln().toInt()
    val distanceList = readln().split(" ").map { it.toInt() }
    val oilPriceList = readln().split(" ").map { it.toInt() }

    var total = 0
    var index = 0

    while (index != n-1) {
        var checked = false
        for (i in index + 1 until n-1) {
            if (oilPriceList[index] > oilPriceList[i]) {
                for (j in index until i) {
                    total += distanceList[j] * oilPriceList[j]
                }
                index = i
                checked = true
                break
            }
        }
        if (!checked) {
            var count = 0
            for (i in index until n-1) {
                total += distanceList[i] * oilPriceList[index]
                count++
            }
            index += count
        }
    }

    print(total)
}