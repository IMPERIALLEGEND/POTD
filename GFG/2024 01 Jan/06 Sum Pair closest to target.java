import java.util.*;
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
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
}