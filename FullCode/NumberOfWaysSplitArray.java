import java.util.Scanner;

public class NumberOfWaysSplitArray {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        long leftSum = 0;
        // rightSum = totalSum - leftSum
        int count = 0;
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            totalSum -= nums[i];

            if (leftSum >= totalSum)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print(waysToSplitArray(nums));
        sc.close();
    }
}
