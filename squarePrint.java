import java.util.Scanner;

public class squarePrint {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        
        // Check if the input is actually an integer to prevent crashes
        if (sc.hasNextInt()) {
            int s = sc.nextInt();
            
            // Call the square method
            square(s);
        } else {
            System.out.println("Invalid input. Please enter a whole number.");
        }
        
        sc.close(); // Good practice to close the scanner
    }

    public static void square(int s) {
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                // Print '*' for boundaries
                if (i == 1 || j == 1 || i == s || j == s) {
                    System.out.print("* ");
                } else {
                    // Print spaces for the hollow center
                    System.out.print("  "); // two spaces " 12"
                }
            }
            System.out.println();
        }
    }
}
