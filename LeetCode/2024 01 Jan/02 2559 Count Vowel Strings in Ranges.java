class Solution {
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n+1];
        int[] ans = new int[queries.length];
        for(int i=1;i<=n;i++){
            prefixSum[i] = prefixSum[i-1] + ((isVowel(words[i-1].charAt(0)) && isVowel(words[i-1].charAt(words[i-1].length() - 1))) ? 1 : 0);
        }

        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = prefixSum[r+1] - prefixSum[l];
        }
        
        return ans;
    }
}