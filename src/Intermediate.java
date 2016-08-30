/**
 * Problem
 * - Given an integer n, return the nth integer in the look-and-say sequence.
 *   Return the result as a string.
 *   Look-and-say sequence starts with 1. Then, subsequent numbers are generated by
 *   describing the previous number in terms of consecutive digits.
 *
 * Example
 * - Input : 8
 * - Output : 1113213211, an 8th entry of the array.
 *              [1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211]
 */
public class Intermediate {

    public static String lookAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder ret = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                int count = 1;
                while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                    j++;
                }
                ret.append(count);
                ret.append(s.charAt(j));
            }
            s = ret.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(lookAndSay(8));
    }
}
