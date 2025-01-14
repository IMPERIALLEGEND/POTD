import java.util.Scanner;

public class FindPrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(++freq[A[i]] == 2) count++;
            if(++freq[B[i]] == 2) count++;
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int[] ans = findThePrefixCommonArray(A, B);

        for (int num : ans) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
