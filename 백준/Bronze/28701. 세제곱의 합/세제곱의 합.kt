/**
 * p28701 세제곱의 합
 */
fun main() {
    val n = readln().toInt()
    val array = arrayListOf<Int>()
    val array2 = arrayListOf<Int>()

    for (i in 1..n) {
        array.add(i)
        array2.add(i*i*i)
    }

    println(array.sum())
    println(array.sum() * array.sum())
    println(array2.sum())
}