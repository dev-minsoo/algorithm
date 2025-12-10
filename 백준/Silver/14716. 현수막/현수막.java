
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 14716 현수막
 */
public class Main {

    static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
    static int[] dy = {1, -1, 0, 1, -1, 0, -1, 1};

    private static void dfs(int x, int y, int[][] graph) {
        graph[x][y] = 2;

        for (int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < graph.length && ny >= 0 && ny < graph[0].length && graph[nx][ny] == 1) {
                dfs(nx, ny, graph);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] graph = new int[m][n];
        int answer = 0;

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j] == 1) {
                    answer++;
                    dfs(i, j, graph);
                }
            }
        }

        System.out.println(answer);
    }
}
