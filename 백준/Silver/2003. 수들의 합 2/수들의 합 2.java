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
        int m = Integer.parseInt(st.nextToken());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int left = 0;
        int right = 0;
        int count = 0;
        int current = 0;

        while (right < n) {
            if (current < m) {
                current += nums[right];
                right++;
            } else if (current == m) {
                count++;
                current -= nums[left];
                left++;
            } else {
                current -= nums[left];
                left++;
            }
        }

        while (left < n) {
            if (current == m) {
                count++;
            }
            current -= nums[left];
            left++;
        }

        System.out.println(count);
    }
}
