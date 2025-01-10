import java.util.*;
class Solution {
    public int[] count(String s){
        int[] bcount = new int[26];
        for(int i=0;i<s.length();i++){
            bcount[s.charAt(i) - 'a']++;
        }
        return bcount;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] bmax = new int[26];

        for(String s: words2){
            int[] bcount = count(s);
            for(int i=0;i<26;i++){
                bmax[i] = Math.max(bmax[i],bcount[i]);
            }
        }

        for(String s: words1){
            int[] acount = count(s);
            boolean isSubSet = true;

            for(int i=0;i<26;i++){
                if(acount[i] < bmax[i]){
                    isSubSet = false;
                    break;
                }
            }

            if(isSubSet) ans.add(s);
        }
        
        return ans;
    }
}