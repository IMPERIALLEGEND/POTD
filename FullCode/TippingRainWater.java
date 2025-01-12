import java.util.Scanner;

public class TippingRainWater {
    public static int maxWater(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (l <= r) {
            leftMax = Math.max(leftMax, arr[l]);
            rightMax = Math.max(rightMax, arr[r]);
            if (leftMax < rightMax) {
                ans += (leftMax - arr[l]);             
                l++;
            } else {
                ans += (rightMax - arr[r]);
                r--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(maxWater(arr));
        sc.close();
    }
}