import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int dfs(int x, int y, int[][] graph, boolean[][] visited) {
        visited[x][y] = true;
        int count = 1;
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < graph.length && ny >= 0 && ny < graph.length) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(nx, ny, graph, visited);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] graph = new int[n][n];
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            char[] charArray = line.toCharArray();
            for (int j = 0; j< charArray.length; j++) {
                graph[i][j] = Character.getNumericValue(charArray[j]);
            }
        }
        boolean[][] visited = new boolean[n][n];

        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    result.add(dfs(i, j, graph, visited));
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int cnt : result) {
            System.out.println(cnt);
        }
    }
}