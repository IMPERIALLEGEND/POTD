import java.util.*;
class Solution {
    int countPairs(int arr[], int target) {
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                count += map.get(target-arr[i]) ;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        return count;
    }
}