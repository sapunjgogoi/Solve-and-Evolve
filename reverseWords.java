// Reverse words 

import java.util.*;

class reverseWords {

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = n - 1;

        while (i >= 0) {

            // Skip dots
            while (i >= 0 && s.charAt(i) == '.') {
                i--;
            }

            if (i < 0)
                break;

            // Mark end of word
            int end = i;

            // Find start of word
            while (i >= 0 && s.charAt(i) != '.') {
                i--;
            }

            int start = i + 1;

            // Append dot if result already has words
            if (result.length() > 0) {
                result.append(".");
            }

            // Append word
            result.append(s.substring(start, end + 1));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String reversed = reverseWords(s);

        System.out.println(reversed);

        sc.close();
    }
}
