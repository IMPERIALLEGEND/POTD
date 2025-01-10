import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementWindow {
    public static ArrayList<Integer> countDistinct(int[] arr, int k) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        ArrayList<Integer> ans = countDistinct(arr, k);

        for (int a : ans) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}
