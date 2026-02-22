import java.util.Scanner;

class lastDigit {
    public static int getLastDigit(int n) {
        // The modulo operator returns the remainder of the division
        // We use Math.abs() to handle negative numbers correctly
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int lastDigit = getLastDigit(n);
        System.out.println("Output: " + lastDigit);
        
        sc.close();
    }
}
