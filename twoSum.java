//Brute Force 
import java.util.*;
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: Pick the first number
        for (int i = 0; i < nums.length; i++) {
            // Step 2: Pick the second number (must be after the first)
            for (int j = i + 1; j < nums.length; j++) {
                // Step 3: Check if they hit the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return empty if no solution is found
        return new int[] {};
    }
}

// Optimized 
import java.util.HashMap;
import java.util.Map;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store: <Value, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the map contains the number we need, return the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, put the current number in the map and keep moving
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
