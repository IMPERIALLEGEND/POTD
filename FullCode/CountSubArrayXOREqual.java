import java.util.HashMap;
import java.util.Scanner;

public class CountSubArrayXOREqual {
    public static long subarrayXor(int[] arr, int k) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.print(subarrayXor(nums, k));
        sc.close();
    }
}
