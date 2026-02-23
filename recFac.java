import java.util.Scanner;

class recFac {
    // Recursive method
    public static long factorial(int n) {
        // 1. Base Case: If n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // 2. Recursive Step: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solution obj = new Solution(); // due to static func

        System.out.print("Enter a number for recursive factorial: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative numbers not allowed.");
            } else {
                System.out.println(num + "! = " + obj.factorial(num));
            }
        }
        sc.close();
    }
}
