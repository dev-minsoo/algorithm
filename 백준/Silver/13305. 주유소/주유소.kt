/**
 * p13305 주유소
 */
fun main() {
    val n = readln().toInt()
    val distanceList = readln().split(" ").map { it.toLong() }
    val oilPriceList = readln().split(" ").map { it.toLong() }

    var total = 0L
    var index = 0

    while (index < n-1) {
        val currentPrice = oilPriceList[index]
        var oilAmount = 0L

        var next = index
        while (next < n - 1) {
            oilAmount += distanceList[next]
            next++

            if (next < n - 1 && oilPriceList[next] < currentPrice) {
                break
            }
        }

        total += currentPrice * oilAmount
        index = next
    }

    print(total)
}