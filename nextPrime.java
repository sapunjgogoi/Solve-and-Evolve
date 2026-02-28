import java.util.Scanner;

class nextPrime {
    
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to find next prime greater than n
    public static int nextPrime(int n) {
        int candidate = n + 1;

        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(nextPrime(n));

        sc.close();
    }
}
