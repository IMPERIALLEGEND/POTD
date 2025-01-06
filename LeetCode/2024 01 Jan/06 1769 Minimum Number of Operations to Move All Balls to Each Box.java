class Solution {
    public int[] minOperations(String boxes) {
        // op[i] = operation till now + count ball till now
        int op = 0;
        int count = 0;
        int n = boxes.length();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] += op;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            op += count;
        }
        op = 0;
        count = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] += op;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            op += count;
        }
        return ans;
    }
}