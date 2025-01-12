class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int[] freq = new int[26];
        int i=0;
        int j=0;
        int maxLen = 0;

        while(j < n){
            char c = s.charAt(j);
            if(freq[c - 'a'] >= 1){
                maxLen = Math.max(maxLen,j-i);
                while(i <= j && s.charAt(i) != s.charAt(j)){
                    freq[s.charAt(i) - 'a'] = 0;
                    i++;
                }
                i++;
            }
            else{
                freq[c - 'a']++;
            }
            j++;
        }
        maxLen = Math.max(maxLen,j-i);

        return maxLen;
    }
}