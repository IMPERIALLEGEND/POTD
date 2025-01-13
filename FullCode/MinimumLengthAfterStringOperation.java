import java.util.Scanner;

public class MinimumLengthAfterStringOperation {
    public static int minimumLength(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i) - 'a']++;
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            int count = freq[i];
            while(count >= 3){
                count -= 2;
            }
            ans += count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(minimumLength(s));
        sc.close();

    }
}
