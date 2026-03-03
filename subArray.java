// gfg => Indexes of Subarray Sum

import java.util.*;

class subArray {
    
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int left = 0;
        long sum = 0;   // use long because target can be up to 10^9
        
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            
            // Shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }
            
            // If sum becomes equal to target
            if (sum == target) {
                result.add(left + 1);   // 1-based index
                result.add(right + 1);  // 1-based index
                return result;
            }
        }
        
        // If no subarray found
        result.add(-1);
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int target1 = 12;
        System.out.println(subarraySum(arr1, target1)); // [2, 4]

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int target2 = 15;
        System.out.println(subarraySum(arr2, target2)); // [1, 5]

        int[] arr3 = {5, 3, 4};
        int target3 = 2;
        System.out.println(subarraySum(arr3, target3)); // [-1]
    }
}
