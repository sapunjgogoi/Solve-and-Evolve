// [Basic] GFG code

import java.util.*;

class Solution {
    static List<Integer> get(int a, int b) {
        // Step 1: Store value of 'a' in a temporary container
        int temp = a;
        
        // Step 2: Assign value of 'b' to 'a'
        a = b;
        
        // Step 3: Assign the stored value (original 'a') to 'b'
        b = temp;
        
        // Return the swapped values as a List
        return List.of(a, b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        System.out.println("Before swap: a = " + x + ", b = " + y);
        
        List<Integer> result = get(x, y);
        
        System.out.println("After swap:  a = " + result.get(0) + ", b = " + result.get(1));
    }
}
