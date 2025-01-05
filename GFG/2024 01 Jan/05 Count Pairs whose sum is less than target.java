import java.util.*;
class Solution {
    int countPairs(int a[], int target) {
        // Your code here
        int left=0;
        Arrays.sort(a);
        int right=a.length-1;
        int c=0;
        while(left<right){
            if(a[left]+a[right]<target){
                c+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return c;
    }
}