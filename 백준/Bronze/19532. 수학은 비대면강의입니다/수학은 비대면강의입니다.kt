/**
 * p19532 수학은 비대면강의입니다
 */
fun main() {
    val nums = readln().split(" ").map { it.toInt() }
    val a = nums[0]
    val b = nums[1]
    val c = nums[2]
    val d = nums[3]
    val e = nums[4]
    val f = nums[5]

    for (x in -999 .. 999) {
        for (y in -999 .. 999) {
            if((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
                println("$x $y")
                return
            }
        }
    }
}