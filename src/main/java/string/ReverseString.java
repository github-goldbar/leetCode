package string;

import java.util.Arrays;

//problem 344
public class ReverseString {
    public static void main(String[] args) {
        //    Example 1:
        //
        //    Input: s = ["h","e","l","l","o"]
        //    Output: ["o","l","l","e","h"]


        //    Example 2:

        //    Input: s = ["H","a","n","n","a","h"]
        //    Output: ["h","a","n","n","a","H"]

        char[] chars = {'m', 'a', 'c', 'b', 'o', 'o', 'k'};
        reverseString(chars);
    }

    public static void reverseString(char[] s) {
        char tmp;
        int charsLength = s.length;

        for (int i = 0; i < charsLength / 2; i++) {
            tmp = s[i];
            s[i] = s[charsLength - i - 1];
            s[charsLength - i - 1] = tmp;
        }

        System.out.println(Arrays.toString(s));
    }
}
