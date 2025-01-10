import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordOfSubset {
    public static int[] count(String s){
        int[] bcount = new int[26];
        for(int i=0;i<s.length();i++){
            bcount[s.charAt(i)-'a']++;
        }
        return bcount;
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] bmax = new int[26];

        for(String s: words2){
            int[] bcount = count(s);
            for(int i=0;i<26;i++){
                bmax[i] = Math.max(bmax[i],bcount[i]);
            }
        }

        for(String s: words1){
            int[] acount = count(s);
            boolean isSubSet = true;

            for(int i=0;i<26;i++){
                if(acount[i] < bmax[i]){
                    isSubSet = false;
                    break;
                }
            }

            if(isSubSet) ans.add(s);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String[] s1 = new String[n1];
        for (int i = 0; i < n1; i++) {
            s1[i] = sc.nextLine();
        }
        int n2 = sc.nextInt();
        String[] s2 = new String[n2];
        for (int i = 0; i < n2; i++) {
            s2[i] = sc.nextLine();
        }

        List<String> ans = wordSubsets(s1, s2);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        sc.close();
    }
}