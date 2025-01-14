class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(++freq[A[i]] == 2) count++;
            if(++freq[B[i]] == 2) count++;
            ans[i] = count;
        }
        return ans;
    }
}