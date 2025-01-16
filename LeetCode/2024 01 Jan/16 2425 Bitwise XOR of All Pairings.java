class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n2 % 2 != 0){
            for(int i: nums1){
                xor1 ^= i;
            }
        }

        if(n1 % 2 != 0){
            for(int i: nums2){
                xor2 ^= i;
            }
        }
        
        return xor1 ^ xor2;
    }
}