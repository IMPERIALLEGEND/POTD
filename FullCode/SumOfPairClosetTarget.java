import java.util.*;

public class SumOfPairClosetTarget {
    public static List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int minDiff = Integer.MAX_VALUE;

        while (l < r) {
            int sum = arr[l] + arr[r];
            int currDiff = Math.abs(sum - target);

            if (currDiff < minDiff) {
                ans.clear();
                ans.add(arr[l]);
                ans.add(arr[r]);
                minDiff = currDiff;
            }

            if (sum > target)
                r--;

            else if (sum < target)
                l++;

            else
                return ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        List<Integer> ans = sumClosest(arr, target);
        System.out.print(ans.get(0) + " " + ans.get(1));

        sc.close();
    }
}
