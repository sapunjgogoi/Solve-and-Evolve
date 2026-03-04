// gfg Array Duplicates

import java.util.ArrayList;

class arrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            // If already negative, it means the number appeared before
            if (arr[index] < 0) {
                result.add(Math.abs(arr[i]));
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }

        return result;
    }
}
