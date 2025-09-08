import java.util.Stack

/**
 * p6549 히스토그램에서 가장 큰 직사각형
 */
fun largestRectangleArea(heights: List<Int>): Long {
    val stack = Stack<Int>()
    var maxArea = 0L

    for (i in 0 .. heights.size) {
        val currentHeight = if (i == heights.size) 0 else heights[i]

        while (stack.isNotEmpty() && heights[stack.peek()] > currentHeight) {
            val height = heights[stack.pop()]
            val width = if (stack.isEmpty()) i else i - stack.peek() - 1
            maxArea = maxOf(maxArea, width.toLong() * height.toLong())
        }

        stack.push(i)
    }

    return maxArea
}

//fun largestSquareArea(heights: List<Int>): Int {
//    val stack = Stack<Int>()
//    var maxArea = 0
//
//    for (i in 0 .. heights.size) {
//        val currentHeight = if (i == heights.size) 0 else heights[i]
//
//        while (stack.isNotEmpty() && heights[stack.peek()] > currentHeight) {
//            val height = heights[stack.pop()]
//            val width = if (stack.isEmpty()) i else i - stack.peek() - 1
//
////             정사각형 조건 : 너비, 높이 중 작은 값을 한 변으로
//            val side = minOf(width, height)
//            maxArea = maxOf(maxArea, side * side)
//        }
//
//        stack.push(i)
//    }
//
//    return maxArea
//}

fun main() {
    while (true) {
        val input = readln().split(" ").map { it.toInt() }
        if (input[0] == 0) break
        val heights = input.subList(1, input.size)
        println(largestRectangleArea(heights))
//        println(largestSquareArea(heights))
    }
}