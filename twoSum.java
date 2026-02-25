import java.util.*;

public class TwoSumComparison {
    /**
     * BRUTE FORCE APPROACH
     * Time: O(n^2) - Nested loops check every pair.
     * Space: O(1) - No extra memory used.
     */
    public static int[] bruteForceTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }

    /**
     * OPTIMIZED APPROACH
     * Time: O(n) - Single pass using a Map for instant lookup.
     * Space: O(n) - Uses a HashMap to store seen values.
     */
    public static int[] optimizedTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Look up if the 'missing piece' exists in our memory
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Record the current number and its index
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // Not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Setup
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("\n--- Running Algorithms ---");

        // 2. Call Brute Force
        int[] bruteResult = bruteForceTwoSum(nums, target);
        System.out.println("Brute Force [O(n^2)] Result: " + Arrays.toString(bruteResult));

        // 3. Call Optimized
        int[] optimizedResult = optimizedTwoSum(nums, target);
        System.out.println("Optimized [O(n)] Result:   " + Arrays.toString(optimizedResult));

        sc.close();
    }
}
