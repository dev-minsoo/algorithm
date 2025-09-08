import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static long largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0L;

        for (int i=0; i<=heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int weight = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, (long) weight * height);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            int[] heights = new int[n];
            for (int i=0; i<n; i++) {
                heights[i] = Integer.parseInt(st.nextToken());
            }

            System.out.println(largestRectangleArea(heights));
        }
    }
}