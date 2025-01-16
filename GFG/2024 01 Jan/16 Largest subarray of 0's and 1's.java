import java.util.*;
class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int sum = 0;
        int maxLen = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i] == 1 ? 1 : -1;
            
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen,i - map.get(sum));
            }
            
            map.putIfAbsent(sum,i);
        }
        
        return maxLen;
    }
}