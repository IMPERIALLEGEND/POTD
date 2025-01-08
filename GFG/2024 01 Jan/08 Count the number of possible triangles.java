import java.util.*;
class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;
        
        for(int i=n-1;i>0;i--){
            
            int r = i - 1;
            int l = 0;
            
            while(l<r){
                
                if(arr[l] + arr[r] > arr[i]){
                    count += r - l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        
        return count;
    }
}