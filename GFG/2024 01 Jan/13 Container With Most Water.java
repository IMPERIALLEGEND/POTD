class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int l = 0;
        int r = arr.length - 1;
        int maxArea = 0;
        
        while(l<r){
            
            int h = Math.min(arr[l],arr[r]);
            int w = r - l;
            maxArea = Math.max(maxArea,h*w);
            
            @SuppressWarnings("unused")
            int ans = (arr[l] > arr[r]) ? r-- : l++;

        }
        
        return maxArea;
    }
}