import java.util.Scanner;
import java.util.Stack;

public class CheckIfParenthesisStringCanBeValid {
    public static boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            char state = locked.charAt(i);

            if (state == '0') {
                // unlocked string we can flip to any bracket
                unlocked.push(i);
            } else if (ch == '(') {
                stack.push(i);
            } // closing bracket
            else if (!stack.isEmpty()) {
                stack.pop();
            } else if (!unlocked.isEmpty()) {
                unlocked.pop();
            } else {
                return false;
            }
        }

        while (!stack.isEmpty() && !unlocked.isEmpty() && stack.peek() < unlocked.peek()) {
            stack.pop();
            unlocked.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String locked = sc.nextLine();

        System.out.print(canBeValid(s, locked));

        sc.close();
    }
}
