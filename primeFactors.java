import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to factorize: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.print("Prime factors of " + n + ": ");
            printPrimeFactorization(n);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        sc.close();
    }

    public static void printPrimeFactorization(int n) {
        // Handle numbers less than 2
        if (n < 2) {
            System.out.println("None (numbers < 2 have no prime factors)");
            return;
        }

        // 1. Extract all factors of 2
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // 2. n must be odd now. Check odd divisors from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // 3. If n is still > 2, the remaining n is a prime number
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println(); // New line for clean output
    }
}
