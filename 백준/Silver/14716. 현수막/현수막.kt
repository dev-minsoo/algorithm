import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

var n: Int = 0
var m: Int = 0

lateinit var graph: Array<IntArray>

val dx = arrayOf(0,0,1,-1,1,-1,1,-1)
val dy = arrayOf(1,-1,0,0,1,1,-1,-1)

var cnt: Int = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    graph = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            graph[i][j] = st.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (graph[i][j] == 1) {
                graph[i][j] = 2
                bfs(i, j)
                cnt++
            }
        }
    }

    println(cnt)
}

fun bfs(i: Int, j: Int) {
    var queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(i, j))

    while (queue.isNotEmpty()) {
        var (x, y) = queue.poll()
        for (k in 0..7) {
            var nx = x + dx[k]
            var ny = y + dy[k]

            if (nx in 0 until n && ny in 0 until m) {
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = 2
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }
}