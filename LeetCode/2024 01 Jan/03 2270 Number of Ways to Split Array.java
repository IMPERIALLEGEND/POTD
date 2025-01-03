class Solution {
    public int waysToSplitArray(int[] nums) {
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
}