import java.util.*;
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int sum = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            if(sum == k) ans++;
            
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        
        return ans;
    }
}