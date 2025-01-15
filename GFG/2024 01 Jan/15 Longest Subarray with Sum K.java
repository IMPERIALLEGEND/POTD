import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum = 0;
        int res = 0;
        map.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            
            if(map.containsKey(currSum - k)){
                res = Math.max(res, i - map.get(currSum - k));
            }
            
            map.putIfAbsent(currSum,i);
        }
        return res;
        
    }
}