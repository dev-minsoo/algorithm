fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()
    if (numbers[0] == 1) {
        for (i in 2 until numbers.size) {
            if (numbers[i] - numbers[i-1] != 1) {
                print("mixed")
                return
            }
        }
        print("ascending")
    } else if (numbers[0] == 8) {
        for (i in 2 until numbers.size) {
            if (numbers[i-1] - numbers[i] != 1) {
                print("mixed")
                return
            }
        }
        print("descending")
    } else {
        print("mixed")
    }
}