import java.util.*;
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        int oddCount = 0;
        for(Map.Entry<Character,Integer> e: mp.entrySet()){
            if(e.getValue() % 2 != 0) oddCount++;
        }
        return oddCount <= k;
    }
}