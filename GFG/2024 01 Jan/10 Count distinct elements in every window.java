import java.util.*;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n && i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        ans.add(mp.size());

        for (int i = k; i < n; i++) {
            if (mp.get(arr[i - k]) == 1)
                mp.remove(arr[i - k]);
            else
                mp.put(arr[i - k], mp.get(arr[i - k]) - 1);

            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            ans.add(mp.size());
        }

        return ans;
    }
}