// [Basic] Rverse A Number
import java.util.Scanner;

class Solution {
    public int reverseDigits(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;       // get last digit
            rev = rev * 10 + r;   // build reversed number
            n = n / 10;           // remove last digit
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        int reversed = sol.reverseDigits(n);

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
