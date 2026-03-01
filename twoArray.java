import java.util.*;

class twoArray {

    public static boolean checkEqual(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of elements in first array
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Decrease frequency using second array
        for (int num : b) {
            if (!map.containsKey(num))
                return false;

            map.put(num, map.get(num) - 1);

            if (map.get(num) == 0)
                map.remove(num);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        // Input first array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input second array
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        boolean result = checkEqual(a, b);

        System.out.println(result);

        sc.close();
    }
}
