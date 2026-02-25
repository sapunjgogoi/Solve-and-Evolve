// HOLLOW SQAURE PATTERN

import java.util.*;

class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                // Check if we are on the boundary
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print spaces for the hollow center
                    System.out.print("  "); 
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}
