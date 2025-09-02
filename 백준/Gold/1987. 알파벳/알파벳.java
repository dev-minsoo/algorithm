import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    private static int dfs(int x, int y, int count, char[][] grid, boolean[] visited) {
        int maxCount = count;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                int idx = grid[nx][ny] - 'A';
                if (!visited[idx]) {
                    visited[idx] = true;
                    maxCount = Math.max(maxCount, dfs(nx, ny, count+1, grid, visited));
                    visited[idx] = false;
                }
            }
        }

        return maxCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] grid = new char[r][c];
        boolean[] visited = new boolean[26];
        for (int i=0; i<r; i++) {
            String line = br.readLine();
            grid[i] = line.toCharArray();
        }

        visited[grid[0][0] - 'A'] = true;
        int maxCount = dfs(0, 0, 1, grid, visited);
        System.out.println(maxCount);
    }
}