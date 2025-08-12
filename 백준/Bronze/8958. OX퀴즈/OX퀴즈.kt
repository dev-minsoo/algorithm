fun main() {
    repeat(readln().toInt()) {
        val quiz = readln()
        var score = 0
        var combo = 0

        quiz.forEach { it ->
            if (it == 'O') {
                score += ++combo
            } else {
                combo = 0
            }
        }

        println(score)
    }
}