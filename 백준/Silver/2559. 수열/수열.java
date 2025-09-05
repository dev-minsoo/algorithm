import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentSum = 0;
        for (int i=0; i<k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;
        for (int i=k; i<n; i++) {
            currentSum = currentSum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}