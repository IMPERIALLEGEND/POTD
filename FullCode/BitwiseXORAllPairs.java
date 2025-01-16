import java.util.Scanner;

public class BitwiseXORAllPairs {
    public static int xorAllNums(int[] num1, int[] num2) {
        int xor1 = 0;
        int xor2 = 0;
        int n1 = num1.length;
        int n2 = num2.length;

        if(n2 % 2 != 0){
            for(int i: num1){
                xor1 ^= i;
            }
        }

        if(n1 % 2 != 0){
            for(int i: num2){
                xor2 ^= i;
            }
        }
        
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num1 = new int[n1];
        for (int i = 0; i < n1; i++)
            num1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] num2 = new int[n2];
        for (int i = 0; i < n2; i++)
            num2[i] = sc.nextInt();

        System.out.print(xorAllNums(num1, num2));

        sc.close();
    }

}
