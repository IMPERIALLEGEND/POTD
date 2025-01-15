import java.util.*;

public class MinimizeXOR {
    public static int minimizeXor(int num1, int num2) {
        int res = 0;
        int setBitCount = Integer.bitCount(num2);

        for (int i = 31; i >= 0 && setBitCount > 0; i--) {
            if((num1 & (1 << i)) != 0){
                res |= 1 << i;
                setBitCount--;
            }
        }

        for(int i=0;i<=31 && setBitCount > 0;i++){
            if((res & (1 << i)) == 0){
                res |= 1 << i;
                setBitCount--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(minimizeXor(num1, num2));

        sc.close();
    }
}
