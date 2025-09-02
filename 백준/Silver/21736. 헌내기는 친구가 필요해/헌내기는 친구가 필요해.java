import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int x;
        int y;
        
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int bfs(Node node, char[][] grid, boolean[][] visited) {
        visited[node.x][node.y] = true;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int count = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i=0; i<4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                    if (!visited[nx][ny] && grid[nx][ny] != 'X') {
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny));
                        if (grid[nx][ny] == 'P') {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        char[][] grid = new char[n][m];
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            grid[i] = line.toCharArray();
        }

        boolean[][] visited = new boolean[n][m];

        outer:
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 'I') {
                    result = bfs(new Node(i, j), grid, visited);
                    break outer;
                }
            }
        }

        System.out.println((result == 0) ? "TT" : result);
    }
}
