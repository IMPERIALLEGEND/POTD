import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        map.put(0,-1);// case if sum is 15 and target is 15 we need 0 (sum - target)in map
        for(int i=0;i<n;i++){
            sum += arr[i];
            //System.out.print(sum+" ");
            if(map.containsKey(sum - target)){
                ans.add(map.get(sum - target) + 2);
                ans.add(i+1);
                return ans;
            }
            else{
                map.put(sum, i);
            }
        }
        
        ans.add(-1);
        return ans;
    }
}