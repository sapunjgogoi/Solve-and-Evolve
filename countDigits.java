import java.util.Scanner;

class countDigits {
    public static int Count(int n) {
        if (n == 0) return 1;
        
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        System.out.println("Output: " + Count(n));
        
        sc.close();
    }
}
