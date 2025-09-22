import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static List<Integer> result;

    static void backtrack(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i).toString());
                if (i < result.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i=start; i<=n; i++) {
            result.add(i);
            backtrack(i+1, depth+1);
            result.remove(result.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new ArrayList<>();
        backtrack(1, 0);
    }
}