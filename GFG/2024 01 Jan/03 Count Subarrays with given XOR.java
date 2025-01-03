import java.util.*;
class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int xorSum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            xorSum ^= arr[i];
            
            if(xorSum == k) count++;

            if(map.containsKey(xorSum ^ k)) count += map.get(xorSum ^ k);

            map.put(xorSum, map.getOrDefault(xorSum, 0)+1);
        }
        return count;
    }
}