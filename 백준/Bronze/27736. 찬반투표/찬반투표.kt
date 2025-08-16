fun main() {
    val n = readln().toInt()
    val votes = readln().split(" ").map { it.toInt() }

    val approve = votes.count { it == 1 }
    val reject = votes.count { it == -1 }
    val pass = votes.count { it == 0 }

    if (n <= pass * 2) {
        print("INVALID")
        return
    }
    print(if (approve > reject) "APPROVED" else "REJECTED")
}