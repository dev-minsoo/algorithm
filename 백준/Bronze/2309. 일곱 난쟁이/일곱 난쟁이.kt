/**
 * p2309 일곱 난쟁이
 */
fun main() {
    val heights = Array(9) { readln().toInt() }
    val total = heights.sum()
    val targetSum = total - 100
    val excludeList = mutableListOf<Int>()
    val result = mutableListOf<Int>()

    outer@ for (i in 0 until 8) {
        for (j in i+1 until 9) {
            if (heights[i] + heights[j] == targetSum) {
                // 바로 결과 생성하고 출력
                val result = mutableListOf<Int>()
                for (k in 0 until 9) {
                    if (k != i && k != j) {
                        result.add(heights[k])
                    }
                }
                result.sort()
                result.forEach { println(it) }
                break@outer
            }
        }
    }
}