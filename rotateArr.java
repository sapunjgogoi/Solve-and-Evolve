// gfg Rotate Array

import java.util.*;

class rotateArr {

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        d = d % n; // handle case when d > n

        // Step 1: reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: reverse remaining elements
        reverse(arr, d, n - 1);

        // Step 3: reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        rotateArr(arr, d);

        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
