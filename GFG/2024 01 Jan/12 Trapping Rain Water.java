class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (l <= r) {
            leftMax = Math.max(leftMax, arr[l]);
            rightMax = Math.max(rightMax, arr[r]);
            if (leftMax < rightMax) {
                ans += (leftMax - arr[l]);             
                l++;
            } else {
                ans += (rightMax - arr[r]);
                r--;
            }

        }
        return ans;
    }
}