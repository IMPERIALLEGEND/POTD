class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        int left_sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum -= arr[i]; // right sum
            if(left_sum == sum){
                return i;
            }
            left_sum += arr[i];
        }
        
        return -1;
    }
}