import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int left = 0;
        int right = n-1;
        int bestL = 0;
        int bestR = n-1;
        int minDiff = Math.abs(nums[left] + nums[right]);

        while (left < right) {
            int sum = nums[left] + nums[right];
            int currentDiff = Math.abs(sum);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                bestL = left;
                bestR = right;
            }

            if (sum == 0) {
                break;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(nums[bestL] + " " + nums[bestR]);
    }
}